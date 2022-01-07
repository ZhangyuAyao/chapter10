package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        //IG ig = new Teacher();
        //IH ih = new Teacher();
    }
}
interface IH {
    void pay();
}
interface IG extends IH{}
class A_ {
    public void play(){};
}
class Teacher extends A_ {
    @Override
    public void play() {
        int a = 0;
    }
}