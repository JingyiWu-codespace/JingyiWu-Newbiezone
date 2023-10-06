package Java30days_韩顺平;
import java.util.Scanner;
public class Switch01 {
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符a-g");
        char ch = myScanner.next().charAt(0);
        switch(ch) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的字符不正确");
                //defalut 后面不论有没有break 都会退出switch
        }
        System.out.println("退出Switch,继续程序");


    }
}
