package Java30days_韩顺平.Chapter1to6;

public class Homework13 {
    public static void main(String[] args){
        Circle1 c = new Circle1();
        PassObject po = new PassObject();
        po.printAreas(c,5);
    }
}
class Circle1 {
    double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double find_Area() {
        return Math.PI * radius * radius;
    }
    //添加方法setRadius，修改对象的半径值
}
class PassObject{
    public void printAreas(Circle1 circle, int times){
        System.out.println("Radius\t"+"\t"+"Area");
        for (int i =1;i<=times;i++){
            circle.setRadius(i);
            //如何拿到c的半径值？
            System.out.println((double)i+"\t"+"\t"+circle.find_Area());
        }
    }

}
