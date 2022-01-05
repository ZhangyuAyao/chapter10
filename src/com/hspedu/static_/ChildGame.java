package com.hspedu.static_;

public class ChildGame {

    public static void main(String[] args) {

        //定义一个变量，count，统计有多少个小孩加入了游戏
        int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;

        System.out.println("共有" + Child.count + "个小孩加入游戏");
        System.out.println();
    }
}

class Child{
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println();
    }
}