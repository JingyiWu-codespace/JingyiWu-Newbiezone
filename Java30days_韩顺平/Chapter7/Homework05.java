package Java30days_韩顺平.Chapter1to6;

public class Homework05 {
    public static void main(String[] args){
        Circle circle = new Circle(3);
        System.out.println(circle.circumference());
        System.out.println(circle.Area());

    }
}
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double circumference(){
        return 2*this.radius*Math.PI;

    }
    public double Area( ){
        return this.radius*this.radius*Math.PI;
    }
}
