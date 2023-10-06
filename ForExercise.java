package Java30days_韩顺平;

public class ForExercise {
    public static void main (String[] args){

        int num = 0;
        int total = 0;
        int start = 10;
        int end = 200;
        int t = 9;
        for (int i = start;i <= end; i++){
            if (i%t==0){
                num++;
                total+=i;
                System.out.println("9的倍数："+i+"\n"+"个数："+num+"\n"+"总和:"+total);
            }
        }
    }
}
