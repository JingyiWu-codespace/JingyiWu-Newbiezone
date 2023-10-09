package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;
public class ArrayHomework {
    public static void main(String[] args){
        int []arr = {10,12,45,90};
        int index = -1;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你想插入的数组：");
        int inputNum = myScanner.nextInt();
        //寻找要插入的索引，如果没有则为最后一位
        for (int i= 0;i <arr.length;i++){
            if(inputNum<=arr[i]){
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = arr.length;
        }
        //System.out.println("index:"+index);

        //制造空内存，并插入输入值；看i/j
        int []arrNew = new int [arr.length+1];
        for (int i = 0,j=0;i<arrNew.length;i++){
            if (index!=i){
                arrNew[i]=arr[j];
                j++;
                //当index==i时，if语句不执行，则进入else语句，j++不执行 i++执行
                // 则i=3，j=2
            } else {
                arrNew[i]= inputNum;
            }
        }
        // 将arr指向arrNew
        arr=arrNew;
        for (int n =0;n<arr.length;n++){
            System.out.println(arr[n]);
        }
    }
}





