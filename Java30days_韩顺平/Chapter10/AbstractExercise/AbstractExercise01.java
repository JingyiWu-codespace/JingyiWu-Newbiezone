package Java30days_韩顺平.Chapter10.AbstractExercise;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("jack",20,3300);
        manager.setBonus(50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee("tom",20,4000);
        commonEmployee.work();

    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
