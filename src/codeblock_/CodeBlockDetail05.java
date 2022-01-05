package codeblock_;

public class CodeBlockDetail05 {
    public static void main(String[] args) {
        new C02();
    }
}

class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private  void m1() {

    }

    private static void m2(){

    }

    static {
        System.out.println(n2);
        //System.out.println(n1);
        //m1();
        m2();
    }

    {
        System.out.println(n2);
        System.out.println(n1);
        m1();
        m2();
    }
}
