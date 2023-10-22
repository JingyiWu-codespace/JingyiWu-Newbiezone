package Java30days_韩顺平.Chapter8.Homeworks.Homework04;

public class Manager extends Employee {
    //自定义特有属性
    private double base;
    //设置getset方法
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    //构造器初始化
    //通过setbonus 赋值
    public Manager(String name,double grade,int day,double daySalary){
        super(name, grade, day, daySalary);

    }
    //重写父类方法
    public void printInfo() {
        System.out.println("姓名：" + getName() + '\t' + "单日工资：" + getDaySalary() + "\t" + "工作天数：" +
                getDay()+'\t'+"等级:"+getGrade()+"\t"+"底薪："+base);
        double sum = base+getGrade()*getDay()*getDaySalary();
        System.out.println("工资总数：" + sum);
    }

}
