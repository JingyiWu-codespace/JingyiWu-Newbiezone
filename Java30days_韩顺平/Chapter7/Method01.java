package Java30days_韩顺平.Chapter7;

public class Method01 {
    public static void main (String[] args){
        //方法使用
        //1. 方法写好后，如果不去调用，他不会输出
        Person_ p1 = new Person_();
        p1.speak();
        p1.cal01();
        p1.cal02(55);
        //调用getSum方法，输入两个整数
        //把方法getSum，返回的值，赋给变量 returnRes
        int returnRes = p1.getSum(6,10);
        System.out.println("getSum()方法返回的值:"+returnRes);
    }
}
class Person_ {
    String name;
    int age;
    //public 表示方法是公开的；void表示方法没有返回值
    //speak是方法名；（）表示形参列表为空
    //{}方法体；里面包含相关的代码与功能
    //我们的方法就是输出一句话“我是一个好人”
    public void speak(){
        System.out.println("我是一个好人");
    }
    //t添加cal01成员方法，可以计算从1+...+1000的结果
    public void cal01(){
        int res = 0;
        for (int i = 0 ;i<=100;i++){
            res+=i;
        }
        System.out.println("计算结果="+res);
    }
    //添加cal02 成员方法，该方法可以接收一个数n，计算从1+..+n的结果
    //1. (int n)形参列表，表示当前有一个形参n，可以接收用户输入
    public void cal02( int n ){
        int res = 0;
        for (int i = 0;i<=n;i++){
            res+=i;
        }
        System.out.println("计算结果="+res);
    }
    //添加getSum成员方法，可以计算两个数的和
    //1. public表示方法是公开的
    //2. int表示方法执行后，返回一个int值
    //3. getSum 方法名
    //4. (int a, int b)形参列表，两个形参，用于接收用户输入
    //5.return res 表示把res的值，返回 （返回给接收者）
    public int getSum(int a,int b){
        int res = a+b;
        return res;
    }
}
