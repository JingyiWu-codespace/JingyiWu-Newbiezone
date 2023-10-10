package Java30days_韩顺平.Chapter7;

public class RecursionExercise01 {
    public static void main(String[] args){
        /*
        请使用递归的方式求出斐波那契数1，1，2，3，5，8，13
         */
        //fibonacci recursion_1= new fibonacci();
        //int res = recursion_1.fib(7);
        //System.out.println(res);
        MonkeyPeach peach = new MonkeyPeach();
        int res = peach.peach(0);
        if (res!=-1){
            System.out.println(res);
        }
        else {System.out.println("退出程序");}

    }
}
class fibonacci {
    public int fib(int n){
        if (n<3){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
}

class MonkeyPeach{
    public int peach(int day){
        //规律：前一天的桃子 = （后一天的桃子+1）*2
        //递归要找到规律，找到方法结束的变量值
        if (day==10) {
            return 1;
        }
        else if( day>=1 && day<10) {
            return (peach(day+1)+1)*2;
        }else{
            System.out.println("输入数据错误");
            return -1;
        }

    }
}
