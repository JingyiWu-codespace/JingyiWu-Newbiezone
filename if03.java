package Java30days_韩顺平;
import java.util.Scanner;
public class if03 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入信用分：");
        //请思考如何捕捉除数字之外数据类型的异常
        int credits = myScanner.nextInt();
        //先对输入信用分，进行数据正确性的验证
        if (credits >=1 && credits<=100){
            if (credits == 100){
                System.out.println("信用极好");
            }
            else if ( credits>80 && credits<99 ){
                System.out.println("信用优秀");
            }
            else if (credits>=60 && credits<=80){
                System.out.println("信用一般");
            }
            else {
                System.out.println("信用不及格");
            }
        }
        else {
            System.out.println("请输入正确的信用值");
        }


    }
}
