package com.hspedu.static_;

public class StaticExercise01 {

    public static void main(String[] args) {
        new Test().count();
        new Test().count();
        System.out.println(Test.count);
    }
}
class Test {
    static int count = 9;
    public void count(){
        System.out.println("count=" + (count++));//这是一个后++，也就是说先输出count，count再增加
    }
}