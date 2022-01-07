package innerClass01;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //1. 传递的是实现了Bell接口的匿名内部类
        //2.
        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

    }
}

interface Bell {
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}