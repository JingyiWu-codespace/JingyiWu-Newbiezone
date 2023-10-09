package Java30days_韩顺平.Chapter1to6;
import java.util.Scanner;
public class TicketSystem {
    public static void main(String[] args){
        //淡季11-4和旺季5-10的月份：
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = myScanner.nextInt();
        if (month>0 && month<=12){
            if (month>=4 && month<=10){
                System.out.println("请输入年龄：");
                int age = myScanner.nextInt();
                if (age>60){
                    int price = 60/3;
                    System.out.println("票价:"+price);
                }else if (age<18){
                    int price = 60/2;
                    System.out.println("票价:"+price);
                }else if (age>18 && age<60){
                    int price = 60;
                    System.out.println("票价:"+price);
                }
            }
            else {
                int age = myScanner.nextInt();
                if (age>18 && age<60){
                    int price = 40;
                    System.out.println("票价:"+price);
                }
                else {int price = 20;
                    System.out.println("票价:"+price);
            }

        }
    }}}

