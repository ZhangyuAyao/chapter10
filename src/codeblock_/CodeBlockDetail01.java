package codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //1、创建对象
        //AA aa = new AA();
        //2、创建子类对象
//        DD aa2 = new DD();
//        DD aa3 = new DD();
        System.out.println(DD.n1);
    }
}

class DD{
    public static int n1 = 8888;
    static {
        System.out.println("DD静态代码块加载");
    }
    {
        System.out.println("DD的普通代码块加载");
    }
}
class AA{

     static {
        System.out.println("AA静态代码块加载");
    }
}