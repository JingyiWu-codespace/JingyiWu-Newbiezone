package Java30days_韩顺平.Chapter8.Polyparameter;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public String manage(){
        return getName()+"疯狂PUA ing";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }


}
