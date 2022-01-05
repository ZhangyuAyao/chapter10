package com.hspedu.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is" + Person.getTotalPerson());
        Person p1 = new Person();
        System.out.println("Number of total is" + Person.getTotalPerson());
    }
}
class Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
        //id++;//静态不能够访问非静态

        return total;
    }

    public Person() {
        total++;
        id = total;
    }
}
