package codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //(1)静态类的加载：先父类-》子类
        //(2)对象的创建，走构造器
        new AAAA();
    }
}

class BBBB {
    public static int n1 = getN1();

    public int n2 = getN2();

    public static int getN1() {
        System.out.println("BBBB static getN1");//(1)
        return 100;
    }
    static {
        System.out.println("BBBB static codeBlock");//(2)
    }
    {
        System.out.println("BBBB codeBlock");//(6)
    }

    public int getN2() {
        System.out.println("BBBB getN2");//(5)
        return 200;
    }

    public BBBB(){
        //1.super()
        //2.普通变量
        System.out.println("BBBB构造器");//(7)
    }
}

class AAAA extends BBBB {
    public static int n1 = getN3();

    public int n2 = getN4();

    public static int getN3() {
        System.out.println("AAAA static getN3");//(3)
        return 100;
    }

    static {
        System.out.println("AAAA static codeBlock");//(4)
    }
    {
        System.out.println("AAAA codeBlock");//(9)
    }
    public int getN4() {
        System.out.println("AAAA getN4 普通的");//(8)
        return 200;
    }

    public AAAA(){
        //1.super()
        //2.普通代码块和普通属性的初始化
        System.out.println("AAAA构造器");//(10)
    }
}
