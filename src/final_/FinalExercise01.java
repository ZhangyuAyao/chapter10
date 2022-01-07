package final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.sumArea());
    }

}

class Circle {
    private double radius;
    private final double PI = 3.14;
    public Circle(double radius){
        this.radius = radius;
    }
    public double sumArea(){
        return radius * radius * PI;
    }
}

class Circle2 {
    private double radius;
    private final double PI;
    public Circle2(double radius){
        PI = 3.14;
        this.radius = radius;
    }
    public double sumArea(){
        return radius * radius * PI;
    }
}

class Circle3 {
    private double radius;
    private final double PI;
    public Circle3(double radius){
        this.radius = radius;
    }
    {
        PI = 3.14;
    }
    public double sumArea(){
        return radius * radius * PI;
    }
}
