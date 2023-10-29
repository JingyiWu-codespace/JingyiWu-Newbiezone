package Java30days_韩顺平.Chapter10.AbstractExercise;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name,int age,double salary){
        super(name,age,salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理"+getName()+"在工作中……");
    }
}
