package Java30days_韩顺平.Chapter12.Exception;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入数字：");

            try {
                input =Integer.parseInt(scanner.next());
                System.out.println("您输入的是："+input);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("输入的不是数字，请重新输入");
            }
        }
        //System.out.println("你输入的是:");


    }
}
