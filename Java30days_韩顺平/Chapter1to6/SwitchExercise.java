package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;

//public class SwitchExercise {
//    public static void main (String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        double score = myScanner.nextDouble();
//        if (score>=0 && score <=100){
//            switch((int)score/60){
//                case 1:
//                    System.out.println("及格");
//                    break;
//                case 0:
//                    System.out.println("不及格");
//                    break;
//            }
//        }else {System.out.println("输入有误");}
//    }
//}
import java.util.Scanner;
public class SwitchExercise {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        switch (month) {//穿透法
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default: System.out.println("输入月份有误");

        }
    }
}
