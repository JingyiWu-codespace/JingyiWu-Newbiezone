package Java30days_韩顺平.Chapter8.Homeworks.Homework04;

public class Employee {
    //属性定义
    private String name;
    private double daySalary;
    private int day;
    private double grade;

    //构造器
    public Employee(String name, double daySalary, int day,double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
        this.grade = grade;
    }

    //set & get 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public double getDaySalary() {
        return daySalary;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }


    // 对象方法
    // 打印工资
    public void printInfo() {
        System.out.println("姓名：" + name + '\t' + "单日工资：" + daySalary + "\t" + "工作天数：" + day);
        System.out.println("工资总数：" + day * daySalary*grade);
    }

}
