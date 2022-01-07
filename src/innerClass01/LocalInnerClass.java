package innerClass01;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02的hashcode=" + outer02);
    }
}

class Outer02 {
    private int n1 = 100;
    private void m2() { System.out.println("Outer02");}
    public void m1(){
        final class Inner02 {//局部内部类,本质上还是一个类
            private int n1 = 800;
            public void f1() {
                System.out.println("n1=" + n1 + "外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer01.this hashcode=" + Outer02.this);
                m2();
            }
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();

    }
}