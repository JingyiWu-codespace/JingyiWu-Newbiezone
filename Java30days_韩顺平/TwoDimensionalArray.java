package Java30days_韩顺平;

public class TwoDimensionalArray {
    public static void main(String[] args){
        //一维数组的表达方式 int[] arr = {};
        //二维数组的表示方法 int [][] arr={{},{}};
        // 1.从定义形式上看 int[][]
        // 2. 可以理解为：原来的一维数据的每个元素是一维数组，构成了二维数组


        int[][] arr={{0,0,0,0,0,0},
                     {0,0,1,0,0,0},
                     {0,2,0,3,0,0},
                     {0,0,0,0,0,0}};
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
