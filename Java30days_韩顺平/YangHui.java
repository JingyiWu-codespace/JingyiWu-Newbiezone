package Java30days_韩顺平;
/* 输出杨辉三角，列数不等的二维数组
    example：
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    规律：
    第一行1个元素；第n行n个元素
    每一行第一个元素和最后一个元素都是1
    从第三行开始，对于非第一个元素和最后一个元素的值
    arr[i][j] = arr[i-1][j]+arr[i-1][j-1]
     */
public class YangHui {
    public static void main(String[] args){
        int arr[][] = new int [10][];
        for (int i = 0;i<arr.length;i++){
            //给每个一维数组（行）开辟内存空间
            arr[i] = new int [i+1];
            for (int j=0; j<arr[i].length;j++){
                if (j==0||j==arr[i].length-1){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }//System.out.print(arr[i][j]+" ");
            }//System.out.println();



        }
    }
}
// int []x, y[]; x是一维数组，y是二维数组