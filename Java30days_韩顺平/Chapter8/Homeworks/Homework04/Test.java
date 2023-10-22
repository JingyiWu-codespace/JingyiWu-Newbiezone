package Java30days_韩顺平.Chapter8.Homeworks.Homework04;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("小李",21,500,1.0);
        worker.printInfo();
        Manager manager = new Manager("小吴",21,500,1.2);
        manager.setBase(50000);
        manager.printInfo();
    }
}
