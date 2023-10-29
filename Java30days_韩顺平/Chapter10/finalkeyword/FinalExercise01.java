package Java30days_韩顺平.Chapter10.finalkeyword;


public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
    }
}
class Circle{
    //定义赋值版本
    //private final double pi=3.14;
    private double radius;
    private final double pi;
    //代码块赋值版本
    {
        pi = 3.14;
    }
    //构造器赋值版本
//    public Circle(double radius) {
//        this.pi = 3.14;
//        this.radius = radius;
//    }
    //
    public Circle(double radius) {
      this.radius = radius;}
    public double getSpace(){
        return (pi*radius*radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                ", space=" + getSpace()+
                '}';
    }
}