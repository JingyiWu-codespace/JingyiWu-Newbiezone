package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;
//动态初始化1
public class Array02 {
    public static void main(String[] args){
        //第一种动态初始化
        //double[] score = new double[6];
        //第二种动态初始化
        double[] score;//这样在内存中没有声明空间
        score = new double[6];//这样才算有空间，分配了内存空间
        //静态初始化
        // int a[]={1,2,3,4,5,6,7,8,9}
        // 数组类型+数组名称+列表符号 = {具体值1，具体指2，……}

        for (int i=0; i <score.length ;i++){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入数组：");
            score[i] = myScanner.nextDouble();
        }
        //输出,遍历数组
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }


    }
    }
