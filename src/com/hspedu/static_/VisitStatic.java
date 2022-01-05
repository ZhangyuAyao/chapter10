package com.hspedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
        A a = new A();
        System.out.println("a.name=" + a.name);
        System.out.println("com.hspedu.static_.A.name=" + A.name);
    }
}

class A {
    public static String name = "张宇";
}