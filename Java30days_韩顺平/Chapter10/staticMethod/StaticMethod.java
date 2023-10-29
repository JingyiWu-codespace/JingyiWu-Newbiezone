package Java30days_韩顺平.Chapter10.staticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("Tom");
        Stu mary = new Stu("mary");
        tom.payFee(3000);
        mary.payFee(2000);
        Stu.showFee();

    }
}
class Stu{
    private static double fee;
    private String name;
    public Stu(String name){
        this.name = name;
    }
    //1/
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费："+Stu.fee);
    }
}
