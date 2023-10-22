package Java30days_韩顺平.Chapter8.Homeworks.Homework05;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("JACK",10000);
        //可以动态修改 年薪的月数
        worker.setSalMonth(15);
        worker.printSal();

        Waiter waiter = new Waiter("Jam",8000);
        waiter.printSal();
        Peasant peasant = new Peasant("Leo",9003);
        peasant.printSal();
        Teacher teacher = new Teacher("顺平",2000);
        teacher.setClassDay(365);//老师的课时费也用set方法来设置，保持灵活性
        teacher.setClassSal(1000);
        teacher.printsal();

        Scientist scientist = new Scientist("吴某某",20000);
        scientist.setBonus(2000000);
        scientist.printsal();

    }
}
