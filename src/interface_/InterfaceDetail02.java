package interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
        //IB.n1 = 7;
    }
}

interface IB {
    int n1 = 10;//等价 public static final n1 = 10
    void hi();
}
interface IC {
    void say();
}

interface ID extends IB,IC {
    void hello();
}
abstract class pig2 implements ID {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

class Pig implements IB,IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

