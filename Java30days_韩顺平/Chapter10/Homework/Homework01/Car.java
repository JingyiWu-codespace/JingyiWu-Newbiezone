package Java30days_韩顺平.Chapter10.Homework.Homework01;

public class Car {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c);
        System.out.println(c1);// 输出red
    }
    double price = 10;
    static String color = "white";
    //此处请注意！！
    // color是静态变量，只加载一次，后续不再加载
    // 所以被构造器赋值为red后，就一直是red
    public String toString(){
        return price+"\t"+color;
    }
    public Car(){
        this.price = 9;
        this.color = "red";
    }
    public Car(double price){
        this.price = price;
    }
}
