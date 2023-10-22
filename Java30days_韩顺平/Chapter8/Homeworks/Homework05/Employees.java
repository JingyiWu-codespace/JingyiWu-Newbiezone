package Java30days_韩顺平.Chapter8.Homeworks.Homework05;

public class Employees {
    private double sal;
    private String name;
    private int salMonth = 12;
    //构造器
    public Employees(String name,double sal){
        this.sal = sal;
        this.name = name;
    }
    //setter and getter
    public void setSal(double sal){
        this.sal = sal;
    }
    public double getSal(){
        return sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    //输出年工资方法
    public void printSal(){
        System.out.println("名字："+name+"工资："+sal*salMonth);
    }
}
