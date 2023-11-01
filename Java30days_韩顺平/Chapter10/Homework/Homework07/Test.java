package Java30days_韩顺平.Chapter10.Homework.Homework07;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        //调用非静态内部类方法1:
        car.setTemperature(45);
        Car.Air air = car.new Air();
        air.flow();
        //调用非静态内部类方法2:内部类写get内部类方法
        Car car1 = new Car();
        //调用非静态内部类方法1:
        //创建air类，在外部调用air方法
        car1.setTemperature(10);
        car1.getAir().flow();

        Car car2 = new Car();
        //调用非静态内部类方法1:
        //创建air类，在外部调用air方法
        car2.setTemperature(-10);
        car2.getAir().flow();

    }
}
