package Java30days_韩顺平;

public class WhileExercise {
//    public static void main(String[] args){
//        int i = 0; int endNum = 100;
//        while(i<=100){
//            ++i;
//            if (i%3==0)
//            {
//                System.out.println("可以被3整除："+i);
//            }
//        }
//    }
//}
    public static void main(String[] args)
    {
        int i = 40;
        int endNum = 200;
        while(i<=endNum){
            if (i%2==0){
                System.out.println(i+"是偶数");
            }
            i++;
        }
    }
}
