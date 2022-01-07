package innerClass01;

public class InnerClassExercise03 {
    public static void main(String[] args) {
        Phone01 phone01 = new Phone01();
        phone01.alarmClock(new Bell01() {
            @Override
            public void ring() {
                System.out.println("匿名内部类重写ring()...");
            }
        });
    }
}

interface Bell01 {
    void ring();
}

class Phone01 {
    public void alarmClock(Bell01 bell) {
        bell.ring();
    }
}