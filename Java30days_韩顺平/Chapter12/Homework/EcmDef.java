package Java30days_韩顺平.Chapter12.Homework;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try{
                //先验证输入的参数个数是否正确 两个参数
                if(args.length!=2){
                    throw new ArrayIndexOutOfBoundsException("参数个数不对");
                }
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                System.out.println(EcmDef.cal(num1,num2));

            }
            catch (NumberFormatException e){
                e.getMessage();
                System.out.println("输入的不是整数");
            }
            catch (ArrayIndexOutOfBoundsException e){
                e.getMessage();
                System.out.println("输入的参数个数不对");
            }
            catch (ArithmeticException e){
                e.getMessage();
                System.out.println("被除数为0");
            }


    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}

