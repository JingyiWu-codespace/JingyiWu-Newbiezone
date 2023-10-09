package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;

public class HomeworkCountrolFlow02 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner myScanner = new Scanner(System.in);
        int i = myScanner.nextInt();
        while (true){
            int a = i/100;
            int b = (i%100)/10;
            int c = i%10;
            int sumTop = a*a*a;
            int sumMiddle = b*b*b;
            int sumSmall = c*c*c;
            int flow = sumTop+sumMiddle+sumSmall;

            if (flow==i){
                System.out.println(i+"是水仙花数");
                break;
            }else{
                System.out.println(i+"不是水仙花数");
                break;
            }
        }

    }
    }
