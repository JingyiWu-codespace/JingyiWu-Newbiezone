package Java30days_韩顺平;
public class ArrayHomework02 {
    public static void main(String[] args){
        int [] arr = new int [10];
        double sum =0;
        int count=0;
        int maxNum = arr[0];
        int maxIndex = 0;
        //生成随机数
        for (int i = 0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
        }
        //倒叙打印
        System.out.println("倒叙打印");
        for(int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
            sum+=arr[i];
            ++count;

            if (arr[i]>maxNum){
                maxNum=arr[i];
                maxIndex = i;
            }

            //查找是否包含8
            if (arr[i]==8){
                System.out.println("此数组包含8");
            }

        }
        System.out.println("计数："+count+" "+"平均数:"+sum/count +" "+ "求和"+sum+" ");
        System.out.println("最大值："+maxNum+" "+"最大值的索引"+maxIndex+" "+"位置:"+(maxIndex+1));

    }
}
