package Java30days_韩顺平.Projects.ChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //化繁为简
    //1. 先完成显示菜单，并可以选择菜单，给对应提示信息
    /*2. 完成零钱通明细
        (1) 可以把收益入账和消费，保存到数组（数组的动态增长）
        (2) 可以使用对象
        (3) 可以使用字符串拼接
      3. 收益入账
        (1)定义新的变量，完成功能驱动程序员增加新的变量和代码
      4. 消费
        (1)定义新变量，保存消费的原因
      5. 用户输入y/n退出，输出输出 while break 结合

     */


    public static void main(String[] args) {
        //听老师讲解，设置loop变量来控制是否退出循环
        boolean loop = true;
        //int input = 0;
        //自己设置的输入是int类型，老师输入是string，不知道有什么区别
        String key = "";
        Scanner scanner = new Scanner(System.in);
        String details = "\n-----------零钱通明细-----------";
        double money = 0;
        double balance = 0;
        String note = "";
        String exit = "";
        Date date = null; //date是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


        do {
            System.out.println("\t\t\t\t\t==零 钱 通 菜 单==\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t1 零钱明细");
            System.out.println("\t\t\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t\t\t3 消   费");
            System.out.println("\t\t\t\t\t\t4 退   出");
            System.out.println("请选择(1-4):");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("请输入金额：");
                    money = scanner.nextDouble();
                    // money 值需要有校验
                    //找出不正确的金额条件，然后给出提示，
                    //就直接break
                    if (money<=0){
                        System.out.println("输入金额有误，请输入大于0的数字");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();
                    details += "\n" + "收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;
                    break;
                case "3":
                    System.out.println("请输入消费金额：");
                    money = scanner.nextDouble();
                    // money 值需要有校验
                    if (money > balance||money<=0) {
                        System.out.println("消费金额应该在 0-\t" + balance+"元");
                        break;
                    }
                    System.out.println("请输入消费明细：");
                    note = scanner.next();
                    balance -= money;
                    //拼接收益入账信息到details
                    date = new Date();
                    details += "\n" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;

                    break;
                case "4":
                    while (true) {
                        System.out.println("您确定要退出吗？y/n");
                        exit = scanner.next();
                        if ("y".equals(exit) || "n".equals(exit)) {
                            break;
                        }
                    }
                    if ("y".equals(exit)) {
                        loop = false;
                        System.out.println("------你退出了零钱通------");
                    }
                    break;

                default:
                    System.out.println("输入有误");
                    break;
            }
        } while (loop);

    }


}
