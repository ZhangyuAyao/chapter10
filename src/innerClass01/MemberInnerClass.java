package innerClass01;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //Outer08.Inner08 inner08 = outer08.new Inner08();
        //Outer08.Inner08 inner08 = outer08.getInstanceInner08();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("hi()方法");
    }


    public class Inner08 {
        private int sal = 89;
        private int n1 = 66;
        public void say() {
            System.out.println("n1= " + n1 + " name = " +name);
        }
    }

    //写方法
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        int temp = inner08.sal;
    }
    public Inner08 getInstanceInner08(){
        return new Inner08();
    }
}
