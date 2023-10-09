package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';

        do {
                System.out.println("老韩使出五连鞭");
                System.out.println("老韩问：还钱吗？y/n");
                answer = myScanner.next().charAt(0);
                System.out.println("你的回答是："+answer);
                //break;
            }
        while(answer !='y');
        System.out.println("李三还钱了");
        }

    }

