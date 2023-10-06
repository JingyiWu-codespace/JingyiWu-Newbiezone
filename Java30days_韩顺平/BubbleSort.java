package Java30days_韩顺平;

public class BubbleSort {
    public static void main(String[] args){
        /*冒泡排序分析：
        临近的两个数交换，把最大的数放在整个数组的最后；
        同理第二次交换，将第二大的数放在倒数第二的位置；
        第三次交换，将第三大的数放在倒数第三的位置；
         */

        /*冒泡排序的总结
        1. 一共5个元素
        2. 经历4次排序，可以看成外部循环
        3. 每1轮排序可以确定一个数的位置，比如第一轮排序可以确定第一大数的位置；
        第二轮可以确定第二大数的位置...
        4. 当进行比较时，如果前面的数大于后面的数，就交换
        5.每一轮比较的数在减少 4>3>2>1
         */
        int[]arr={24,69,80,57,13,-1,30,200,-110};
        int temp = 0;
        int count ;
        for (count=1;count<arr.length;count++){//设置轮数
            for (int i =0;i<arr.length-count;i++){//交换数据
                if (arr[i]>arr[i+1]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println('\n'+"第"+count+"轮");
            for (int i=0;i<arr.length;i++){

                System.out.print(arr[i]+" ");

        }

//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}}
