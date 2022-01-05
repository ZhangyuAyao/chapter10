package single_;

public class SIngleTon01 {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
//        GirlFriend instance = GirlFriend.getInstance();
//        System.out.println(instance);
        System.out.println(GirlFriend.n1);//饿汉式，访问n1，gf就已经创建了
    }
}

class GirlFriend {
    private String name;

    public static int n1 = 100;
    //为了能够在静态方法中，返回gf对象，需要将其修饰为static

    private static GirlFriend gf = new GirlFriend("小红红");

    private GirlFriend(String name){
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }
}