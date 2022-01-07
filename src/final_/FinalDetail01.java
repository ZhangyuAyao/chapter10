package final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        EE e = new EE();
        e.cal();


    }
}

class AA {
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 1.1;
    }
    {
        TAX_RATE3 = 8.8;
    }
}

class BB {
    /*final 修饰 static 静态变量*/
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
    //public static final double TAX_RATE3;

    public BB() {
        //TAX_RATE3 = 8.8;
    }

    static {
        TAX_RATE2 = 9.0;
    }

}

final class CC { }

//class CC_sub extends CC { }
class DD {
    public final void cal() {
        System.out.println("final cal()");
    }
}

class EE extends DD {
}
