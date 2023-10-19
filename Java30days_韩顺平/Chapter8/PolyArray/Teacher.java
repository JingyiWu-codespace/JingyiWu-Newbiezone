package Java30days_韩顺平.Chapter8.PolyArray;

public class Teacher extends Person{

    private double salary;
    public Teacher(String name, int age,double salary){
        super(name,age);
        this.salary = salary;
    }
    public void setScore(double salary){
        this.salary = salary;
    }
    public double getScore(){
        return salary;
    }
    public String say(){
        return super.say()+"薪水"+salary;
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在讲课");
    }
}
