package codeblock_;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("person total " + Person.total);
        System.out.println("person total " + Person.total);
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("total" + total);
    }
}
