package Java30days_韩顺平.Chapter7;

public class MethodExercise01 {
    public static void main(String[] args){
        AAA exercise = new AAA();
        boolean res = exercise.oddEven(100);
        //System.out.print(res);
        exercise.printChar(20,10,'_');

    }
}
class AAA  {
    public boolean oddEven(int n){
        return n%2==0 ? true : false;
//        if (n%2==0){
//            return(true);
//        }else {return(false);}
    }
    public void printChar(int r,int c,char ch){
        for (int i = 0 ;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(ch);
            }System.out.println();

        }
    }
}
