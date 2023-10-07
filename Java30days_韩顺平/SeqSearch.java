package Java30days_韩顺平;
import java.util.Scanner;
public class SeqSearch {
    public static void main(String[] args){

        String names[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        System.out.println("请输入一个名称：");
        Scanner myScanner = new Scanner(System.in);
        String inputName = myScanner.next();
        int index=-1; //用于标记找没找到
        for (int i=0;i<names.length;i++){
            //字符串的比较用equals！！！！
            if (inputName.equals(names[i])){
                System.out.println("找到了"+" "+"下标："+i);
                index = i;
                break;
            }
        }
//            else{
//                System.out.println("没找到");
//                continue;
//            }
            //如果index的值没有被改变，说明从来没进入过相等的程序
            //  注意在for循环外，建立if，否则如果第一个字符不相等。
            //  会直接输出没找到；
            if (index==-1){
                System.out.println("没找到");

            }



    }
}
