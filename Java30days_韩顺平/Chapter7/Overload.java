package Java30days_韩顺平.Chapter7;

public class Overload {
    public static void main(String[] args){
        Methods t1=new Methods();
        System.out.println(t1.m(5));
        System.out.println(t1.m(3,7));
        System.out.println(t1.m("不要吵架了，以后要好好学习！"));
        System.out.println(t1.max(2,10));
        System.out.println(t1.max(3.158,0.524));
        System.out.println(t1.max(4.8765,34.657,4.8765));

    }
}
class Methods{
    public int m(int n){
        return n*n;
    }
    public int  m(int a,int b){
        return a*b;
    }
    public String m(String str){
        return str;
    }
    public int max(int a,int b){
        //使用三元运算符
        return a>b?a:b;
//        if (a>b){return a;}
//        else if(a<b) {return b;}
//        else {
//            return a;}
    }

    public double max(double a, double b){
        return a>b?a:b;
//        if (a>b){return a;}
//        else if(a<b) {return b;}
//        else {return a;}
    }

    public double max (double a, double b,double c){
        double max1 = a > b ? a : b;
        return max1 > c ? max1 : c;
//        if (a>=b&&a>=c){return a;}
//        else if(b>=a&&b>=c){return b;}
//        else if(c>=a&&c>=b){return b;}
//        else return 0.0;
    }
}