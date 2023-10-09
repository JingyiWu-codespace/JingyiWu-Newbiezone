package Java30days_韩顺平.Chapter1to6;

public class ArrayCopy {
    public static void main(String[] args){
        int[] arr1 = {10,20,30};

        //创建一个新的数组arr2，作为arr1的值拷贝
        // 开辟arr2自己的数据空间

        int[] arr2 = new int[arr1.length];
        //遍历arr1,把每个元素拷贝到arr对应的位置
        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
            System.out.println(arr2[i]);
        }
        arr2[0]=100;
        for (int i=0;i<arr1.length;i++){

            System.out.println(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){

            System.out.println(arr2[i]);
        }




    }
}
