package Java30days_韩顺平.Projects.ChangeSysOop;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class SmallChangeSysOOP {
    boolean loop=true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "\n-----------零钱通明细-----------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";


    public void mainMenu() {
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
                    this.detailed();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exitMethod();
                    break;
                default:
                    System.out.println("输入有误");
            }
        } while (loop);
    }


    public void detailed() {
        System.out.println(details);
    }

    public void income() {
        System.out.println("请输入金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("输入金额有误，请输入大于0的数字");
            return;
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();
        details += "\n" + "收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;
    }

    public void pay() {
        System.out.println("请输入消费金额：");
        money = scanner.nextDouble();
        if (money > balance || money <= 0) {
            System.out.println("消费金额应该在 0-\t" + balance + "元");
            return;
        }
        System.out.println("请输入消费明细：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + "余额\t" + balance;
    }

    public void exitMethod() {
        String exit = "";

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
    }
}

