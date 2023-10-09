package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;
public class Stars {
    public static void main(String[] args){
        System.out.println("请输入打印的层级：");
        Scanner myScanner = new Scanner(System.in);
        int totalLevel = myScanner.nextInt();




        for (int i=1;i<=totalLevel;i++){
            //在输出*之前还要输出空格 空格数是总层数-当前层
            for (int k=1;k<=totalLevel-i;k++){
                System.out.print(" ");
            }
        //控制打印每层*的个数
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==2*i-1||i==totalLevel)
                {
                    System.out.print("*");
                }
                else{System.out.print(" ");}
                //不换行
            }
            System.out.println("");
            //结束一次循环换一个行
        }
    }
}
