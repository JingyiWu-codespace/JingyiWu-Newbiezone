package Java30days_韩顺平;
import java.util.Scanner;
public class ArrayHomework03 {
    public static void main(String[] args){
        //再来一遍冒泡排序！
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你想要构成的数组个数：");
        int n = myScanner.nextInt();
        int arr[] = new int[n];
        int temp=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
            System.out.print(arr[i]+" ");
        }
        for (int i =0;i<arr.length;i++){//比较轮数
            for (int j = 0;j<arr.length-1-i;j++){//比较的次数
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        System.out.println(" ");
        System.out.println("======排序之后的=======");

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
