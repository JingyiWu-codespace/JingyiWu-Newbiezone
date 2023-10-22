package Java30days_韩顺平.Chapter8.Homeworks.Homework05;

public class Teacher extends Employees{
    private double classDay;
    private double classSal;
    public Teacher(String name,double sal){
        super(name,sal);
    }
    public void setClassDay(double classDay){
        this.classDay = classDay;
    }
    public void setClassSal(double classSal){
        this.classSal = classSal;
    }
    public double getClassDay(){
        return classDay;
    }
    public double getClassSal(){
        return classSal;
    }

    public void printsal(){
        System.out.println("教师"+getName());
        double sum = classDay*classSal+getSal()*getSalMonth();
        System.out.println("年薪："+ sum);
    }
}
