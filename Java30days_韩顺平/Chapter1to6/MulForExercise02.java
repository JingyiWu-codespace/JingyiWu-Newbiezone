package Java30days_韩顺平.Chapter1to6;
// 9*9乘法表
public class MulForExercise02 {
    public static void main(String[] args){
        int startNum = 1;
        int endNum = 9;
        for (int i=startNum;i<=endNum;i++){
            for(int j=startNum;j<=i;j++)
            {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
