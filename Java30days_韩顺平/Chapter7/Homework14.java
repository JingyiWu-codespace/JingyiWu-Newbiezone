package Java30days_韩顺平.Chapter1to6;
// Tom设计他的成员变量、成员方法、可以电脑猜拳
// 电脑每次随机生成 0，1，2
// 0 表示 石头 1 表示剪刀 2表示 布
// 并要显示玩家赢的次数
import java.util.Random;
import java.util.Scanner;
public class Homework14 {
    //测试类，主类
    public static void main (String[] args){
        int count=0;
        Scanner scanner = new Scanner(System.in);
        Game game1 = new Game();
        count = 0;
        int sign=1;
        while (sign==1){
            System.out.println("是否开始游戏？1/0");
            sign = scanner.nextInt();
            if (sign != 1 ){break;}
            String cs_input = game1.computerInput();
            String user_input = game1.userInput();
            if (cs_input.equals(user_input)){
                System.out.println("平局\t"+"用户出拳："+user_input+"\t电脑出拳："+cs_input);
                continue;
            } else if(cs_input.equals("石头")&&user_input.equals("布"))  {
                count++;
                System.out.println("用户胜利\t"+"用户出拳："+user_input+"\t电脑出拳："+cs_input);
                continue;
            } else if (cs_input.equals("布")&&user_input.equals("剪刀"))  {
                count++;
                System.out.println("用户胜利\t"+"用户出拳："+user_input+"\t电脑出拳："+cs_input);
                continue;
            } else {
                System.out.println("电脑胜利\t" + "电脑出拳：" + cs_input+"\t用户出拳：" + user_input );
                continue;
                }
        }System.out.println("用户胜利总次数："+count+"次");
    }
}
class Game{
    int cs_input; //0，1，2
    public Game(){

    }
    public String computerInput(){
        Random randomNum = new Random();
        String cs_res = "";
        int cs_input = randomNum.nextInt(3);
        if (cs_input == 0){
            cs_res =  "石头";
        } else if (cs_input == 1) {
            cs_res =  "剪刀";
        } else if (cs_input ==2) {
            cs_res = "布";
        } return cs_res;
    }
    public String userInput(){
        int user_res;
        System.out.println("请出拳：剪刀/石头/布");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.next();
        return input;
    }
}
