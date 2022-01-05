package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);
        System.out.println(B.n2);

        //静态变量是类加载的时候就创建，所以没有创建对象实例也可以通过类型.类变量名来访问
        System.out.println(C.address);
    }
}

class B {
    public int n1 = 100;
    public static int n2  = 200;
}

class C {
    public static String address = "北京";
}
