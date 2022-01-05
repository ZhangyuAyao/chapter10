package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu mary = new Stu("mary");
        mary.payFee(100);

        //输出当前收到的总学费
        mary.showFee();

        Stu.showFee();
        //Math.abs()
    }
}
//开发自己的工具类，可以将方法做成静态的，方便调用

class Mytools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}
class Stu {
    private String name;

    private static double fee = 0;

    public Stu(String name){
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有： "+ Stu.fee);
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;
    public void say() {

    }

    public static void hi(){
        System.out.println();
    }

    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2); 静态方法不能访问非静态变量
        hi();//ok
        //say();//静态方法不能够访问非静态方法
    }

    public void ok() {
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hi();
    }
}