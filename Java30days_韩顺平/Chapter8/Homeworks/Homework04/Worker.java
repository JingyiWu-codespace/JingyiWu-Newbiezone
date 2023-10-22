package Java30days_韩顺平.Chapter8.Homeworks.Homework04;

public class Worker extends Employee{
    //属性
    //get set
    //构造器
    public Worker(String name, double grade, int day,double daySalary){
        super(name, grade, day, daySalary);
    }
    //方法重写
    public void printInfo() {
        //System.out.println("种类：部门员工"+" "+"姓名：" + getName() + '\t' + "单日工资：" + getDaySalary() + "\t" + "工作天数：" + getDay());
        super.printInfo();
    }
}
