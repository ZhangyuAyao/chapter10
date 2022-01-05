package main;

public class Main01 {
    private static String name  = "123";
    private int n1 = 10000;
    public static void hi() {
        System.out.println("Main01的hi方法");
    }
    public void cry(){
        System.out.println("Main01的cry方法");
    }
    public static void main(String[] args) {
        System.out.println(name);//static
        //System.out.println(n1);//non-static
        hi();//static
        //cry();//non-static
        Main01 main01 = new Main01();//new 一个对象之后可以使用了
        System.out.println(main01.n1);
        main01.cry();
    }
}
