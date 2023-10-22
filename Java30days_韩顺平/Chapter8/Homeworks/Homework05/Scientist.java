package Java30days_韩顺平.Chapter8.Homeworks.Homework05;

public class Scientist extends Employees{
    private double bonus;
    public Scientist(String name,double sal){
        super(name,sal);
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public void printsal(){
        double sum = getSal()*getSalMonth()+bonus;
        System.out.println("科学家小吴"+sum);
    }

}
