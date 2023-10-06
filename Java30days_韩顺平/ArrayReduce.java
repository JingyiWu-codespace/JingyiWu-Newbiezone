package Java30days_韩顺平;
import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        int []arrNew;
        Scanner myScanner = new Scanner(System.in);


        do {
            arrNew = new int[arr.length-1];
            System.out.println("是否要缩减数组? y/n");
            char key = myScanner.next().charAt(0);

            for (int i =0;i<arrNew.length;i++){
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            for (int i=0;i<arrNew.length;i++){
                System.out.print(arrNew[i]+"\t");
            }
            if (key=='y'){
                if (arrNew.length==1){
                    System.out.println("当前只剩最后一个元素不能缩减");
                }
                continue;
            }
            else{
                System.out.print("停止缩减");
                break;
            }
        }
        while(arrNew.length>1);


    }
}
