package innerClass01;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println(outer05);
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        //
        Person person = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法 n1="+n1+"外部类的n1="+Outer05.this.n1);
                System.out.println("main Outer05.this. hashcode ="+ Outer05.this);
            }
        };
        person.hi();

        //也可以直接调用
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Pnerson ok..."+ str);
    }
}