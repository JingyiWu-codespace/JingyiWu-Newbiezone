package Java30days_韩顺平.Chapter8.Homeworks.Homework05;

public class Worker extends Employees{
    public Worker(String name,double sal){
        super(name,sal);
    }
    public void printSal(){
        System.out.println("工人"+getName());
        super.printSal();
    }
}
class Peasant extends Employees{
    public Peasant(String name,double sal){
        super(name,sal);;
    }
    public void printSal(){
        System.out.println("农民"+getName());
        super.printSal();
    }
}

class Waiter extends Employees{
    public Waiter(String name,double sal){
        super(name,sal);
    }
    public void printSal(){
        System.out.println("服务员"+getName());
        super.printSal();
    }
}