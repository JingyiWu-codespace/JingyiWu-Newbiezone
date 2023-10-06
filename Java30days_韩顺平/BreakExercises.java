package Java30days_韩顺平;
import java.util.Scanner;
public class BreakExercises {
    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);
        String name ="";
        String passwd="";
        int chance = 3;
        for (int i = 1; i<=3;i++){
            System.out.println("请输入用户名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            passwd = myScanner.next();
            //字符串比较用equal方法
            if ("丁真".equals(name) && "666".equals(passwd)){
                System.out.println("登陆成功");
                break;
            }
            chance--;
            System.out.println("还有"+chance+"次" + "登陆机会");

        }
        System.out.println("机会用完了，下次吧");
    }
}
