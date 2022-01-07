package innerClass01;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("使用匿名内部类重写了show方法");
            }
        });
    }

    //静态方法，形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}