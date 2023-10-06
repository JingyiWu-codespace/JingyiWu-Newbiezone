package Java30days_韩顺平;

public class HomeworkControlFlow03 {
    public static void main(String[] args){
        int i =0;
        int startNum =1;
        int endNum=100;
        int count= 0;
        for (i=1;i<=endNum;i++){
            if (i%5!=0){
                System.out.print(i+"不能被5整除."+"\t");
                count++;
                if (count%5==0){
                    System.out.println("");
                }
            }


        }

    }

}
