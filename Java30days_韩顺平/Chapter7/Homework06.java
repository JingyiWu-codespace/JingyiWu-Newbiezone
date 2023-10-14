package Java30days_韩顺平.Chapter1to6;

public class Homework06 {
    public static void main(String[] args){
        Cale t1 = new Cale(3,4);
        Cale t2 = new Cale(-3,0);
        Double div = t1.divid();
        if (div!=null){
            System.out.println(t2.divid());
        }

    }

}
class Cale{
    double a;
    double b;
    //先放个空的构造器
    public Cale(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double sum(){
        return this.a+this.b;
    }
    public double sub(){
        return this.a-this.b;
    }
    public double multi(){
        return this.a*this.b;
    }
    public Double divid(){
        if (b != 0) {
            return this.a/this.b;
        }
        else if (b==0){
            System.out.println("除数不能为0");
            return null;
        }
        return null;
    }
    //方法 和 差 乘 商
}
