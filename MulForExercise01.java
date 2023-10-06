package Java30days_韩顺平;
import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int total_count = 0;
        int i = 0;
        int j = 0;
        int classNum = 3;
        int stuNum = 5;
        int passNum = 0;
        for (j=1;j<=classNum;j++) {
            double sum = 0;
            for (i = 1; i <= stuNum; i++) {
                System.out.println("请输出第" + j + "个班里，第" + i + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >=60){
                    passNum++;
                }
                sum += score;
                total_count = j*i;
            }
            System.out.println("第" + j + "个班的" + "总分" + sum + "第" + j + "个班里的平均分：" + (sum / 5));
            totalScore +=sum;

        }
        System.out.println("三个班的总分："+totalScore+"总平均分："+totalScore/total_count+"及格人数："+passNum);
        System.out.println("总人数"+total_count);
    }
}
