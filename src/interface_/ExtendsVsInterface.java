package interface_;

import java.lang.reflect.Modifier;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("小悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}

interface Fishable {
    void swimming();
}

interface  Bird {
    void flying();
}

class Monkey {
    private String name;
    public void climbing() {
        System.out.println("猴子会爬树...");
    }
    public Monkey(String name) {
        this.name  = name;
    }

    public String getName() {
        return name;
    }
}

class LittleMonkey extends Monkey implements Fishable,Bird{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，可以像鱼一样游泳");
    }


    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，可以像鸟一样游泳");
    }
}
