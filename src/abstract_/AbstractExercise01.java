package abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
//        Manage manage = new Manage("zhangyu", "123", 100, 100);
//        manage.work();
    }
}

abstract class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    abstract void work();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

class CommonEmployee extends Employee{
    @Override
    void work() {
        System.out.println("CommonEmployee " + getName());
    }

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }
}

class Manage extends Employee{
    private double bonus;
    @Override
    void work() {
        System.out.println("Manager " + getName());
    }

    public Manage(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}