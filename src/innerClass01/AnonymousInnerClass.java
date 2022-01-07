package innerClass01;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;
    public void method() {
//        IA tiger = new Tiger();
//        tiger.cry();
        /*
        看底层
        class XXXX implements IA {
             @Override
             public void cry() {
                System.out.println("老虎叫...");
        }
        */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫..." );
            }
        };
        tiger.cry();
        System.out.println("老虎叫..." + tiger.getClass());

        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        father.test();
        System.out.println("father..." + father.getClass());

        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };


    }
}

//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

interface IA {
    public void cry();
}

class Father {
    public Father(String name){
        System.out.println("接收到name=" + name);
    }
    public void test(){}
}

abstract class Animal {
    abstract void eat();
}