package interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
    }
}

interface IA {
    void say();
    void hi();
    //public abstract void  say();
}

class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {

}