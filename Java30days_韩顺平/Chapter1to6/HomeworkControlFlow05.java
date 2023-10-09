package Java30days_韩顺平.Chapter1to6;

public class HomeworkControlFlow05 {
    public static void main(String[] args){
        int startNum = 1;
        int endNum = 100;
        double sum=0;
        for (double i =1;i<=100;i++){
            if (i%2!=0){
                sum +=1.0/i;
            }
            else{
                sum = sum - (1/i);
                sum -=1.0/i;
            }

        }
        System.out.println("sum="+sum);
    }
    }

