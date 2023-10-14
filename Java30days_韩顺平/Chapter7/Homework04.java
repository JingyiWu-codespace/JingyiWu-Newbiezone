package Java30days_韩顺平.Chapter1to6;

public class Homework04 {
    public static void main(String[] args){
        int []oldArr = {1,4,5,987,23,98};
        A03 t1 = new A03();
        int []newArr = t1.copyArr(oldArr);
        for (int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
        System.out.println(oldArr);
        System.out.println(newArr);
    }
}
class A03{
    public int[] copyArr(int[]oldArr){
        int arrNew[]=new int [oldArr.length];
        for (int i =0;i<oldArr.length;i++){
            arrNew[i]=oldArr[i];
        }return arrNew;
    }

}
