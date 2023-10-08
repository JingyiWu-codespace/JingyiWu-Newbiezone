package Java30days_韩顺平.Chapter7;

public class Method02 {
    public static void main(String[] args){
        int [][]map={{0,0,1},{1,1,1},{1,1,3}};
        //使用方法完成输出；
        MyTools tool = new MyTools();
        tool.printArr(map);
        tool.printArr(map);

        //传统方式遍历二维数组，代码冗余性高；可改变性低
//        for (int i=0; i <map.length;i++){
//            for (int j=0;j<map[i].length;j++){
//                System.out.print (map[i][j]+" ");
//            }System.out.println ();
        }
    }

//把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools{
    public void printArr(int[][]map){
        //对传入的map数组进行遍历
        System.out.println("========");
        for (int i=0; i <map.length;i++){
            for (int j=0;j<map[i].length;j++){
                System.out.print (map[i][j]+" ");
            }System.out.println ();
        }
    }
}
/*成员方法的好处：
1. 提高代码的复用性
2. 可以将实现的细节封装起来，然后供其他用户来调用即可
 */