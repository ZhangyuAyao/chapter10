package codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();//(1)getN1, (2)n1 (3)static代码块 （4）getN2 (5)普通代码块01 (5)
    }
}

class A {

    private int n2 = getN2();

    {
        System.out.println("A的普通代码块01....");
    }


    public static int getN1() {
        System.out.println("getN1被调用....");
        return 100;
    }

    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块01");
    }



    public int getN2() {
        System.out.println("getN2被调用....");
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("A()构造器被调用");
    }
}
