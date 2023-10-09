package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[]arr = {1,2,3};

        do{
            int[]arr1 = new int [arr.length+1];
            System.out.println("请输入增加的变量？");
            int input = myScanner.nextInt();
            for (int i = 0;i<arr.length;i++){
                arr1[i]=arr[i];
            }

            arr1[arr1.length - 1] = input;
            arr = arr1;


            for (int i =0;i<arr1.length;i++){
                System.out.println(arr[i]);
            }

            System.out.println("是否继续？y/n");
            char answer = myScanner.next().charAt(0);
            if (answer=='y'){
                System.out.println("继续添加");
                continue;
            }
            else if(answer=='n'){
                System.out.println("停止添加，退出程序");
                break;
            }
            else{System.out.println("输入有误，请重新输入");}
        }
        while(true);


    }
}
