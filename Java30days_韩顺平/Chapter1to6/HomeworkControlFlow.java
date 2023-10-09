package Java30days_韩顺平.Chapter1to6;

public class HomeworkControlFlow {
    public static void main(String[] args){
        double money = 100000;
        int time = 0;
        while(money>=0)
        {
            if (money>50000){
                //money = money-0.05*money;
                money*=0.95;
                time++;
                //System.out.println("经过路口的次数:"+time+"剩余钱数："+money);
            } else if (money>=1000) {
                money-=1000;
                time++;
                //System.out.println("经过路口的次数:"+time+"剩余钱数："+money);
            } else{
                //System.out.println("你的钱不够交罚款了，"+"剩余钱数："+money);
                break;
            }
        }System.out.println("经过路口的次数:"+time+" "+"剩余钱数："+money);
    }
}

