package Java30days_韩顺平;

public class TwoDimensionalArray03 {
    //动态输出列数不确定的二维数组
    //有三个元素，但是每个元素的个数不确定
    //example
    // 1
    // 2 2
    // 3 3 3
    public static void main(String[] args){
        int arr[][];
        arr= new int [10][];
        for(int i =  0;i< arr.length;i++){
            arr[i] = new int[i+1];
            //在给每个1维数组开空间
            //第1个数组中有1个元素
            //第2个数组中有2个元素
            //第3个数组中有3个元素
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=i+1;
            }
        }
        for(int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
