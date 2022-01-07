package interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    public void hi();

    public default void ok() {
        System.out.println("ok...");
    }
}
