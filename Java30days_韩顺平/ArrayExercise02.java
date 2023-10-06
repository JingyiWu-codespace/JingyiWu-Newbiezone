package Java30days_韩顺平;
import java.util.Scanner;
public class ArrayExercise02 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组的个数：");
        int n = myScanner.nextInt();
        int arr[] = new int[n];
        for (int j=0;j<n;j++){
            System.out.println("请输入数组的值：");
            arr[j]=myScanner.nextInt();
        }
        //int arr[] = {4,-1,9,10,23};
        int max = arr[0];
        int maxIndex = 0;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;

            }

        }System.out.println("值："+max+" "+"索引："+maxIndex);


    }
}
