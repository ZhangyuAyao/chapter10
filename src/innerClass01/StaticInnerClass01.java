package innerClass01;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();


        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        Outer10.Inner10.say();

    }
}


class Outer10 {
    private int n1 = 10;
    private static String name = "张三";
    private static void cry(){};



    static class Inner10 {
        private static String name = "hspjy";
        public static void say() {
            System.out.println("静态内部类..."+Outer10.name);
            cry();
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();

    }

    public static Inner10 getInner10() {
        return new Inner10();
    }

}