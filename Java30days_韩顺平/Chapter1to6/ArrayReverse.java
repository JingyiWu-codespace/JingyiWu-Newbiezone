package Java30days_韩顺平.Chapter1to6;

public class ArrayReverse {
    //一种方法：
    public static void main(String[] args){
          int arr1[] ={11,22,33,44,55,66};
          int arr2[] = new int [arr1.length];
          for (int i =(arr1.length)-1,j=0;i>=0;i--,j++){
            {
                arr2[j]=arr1[i];
                System.out.println(arr2[j]);
          }


          }}}


//        int len=arr1.length;
//
//        for (int i =0;i<len/2;i++){
//              int mid = arr1[len-1-i];
//              arr1[len-1-i]=arr1[i];
//              arr1[i]=mid;
//          }
//        for (int i=0;i<len;i++){
//            System.out.println(arr1[i]);
//        };
//
//    }
//}
