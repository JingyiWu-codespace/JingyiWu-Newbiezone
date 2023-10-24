package Java30days_韩顺平.Chapter8.Homeworks.Homework09;

public class Homework09 {
    public static void main(String[] args) {
        LabelPoint labelPoint = new LabelPoint("Black",1929,230.07);

    }

}
class Point{
    private double x;
    private double y;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
class LabelPoint extends Point{
    private String label;
    public LabelPoint(String label,double x,double y){
        super(x,y);
        this.label=label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
}