package Java30days_韩顺平.Chapter1to6;

public class DoWhileExercise {
    public static void main(String[] args){
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<=100);
//
//        int j = 1;
//        int sum = 0;
//        do{
//            sum+=j;
//            System.out.println("数字："+j+"总和："+sum);
//            j++;
//        }
//        while(j<=100);

        int startNum = 1;
        int endNum = 200;
        int count=0;
        do{
            if(startNum % 5 == 0 && startNum % 3!=0){
                count++;
                System.out.println("个数："+count+"具体数字："+startNum);
            }

            startNum++;
        }
        while(startNum<endNum);
}}
