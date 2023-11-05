package Java30days_韩顺平.Chapter13.StringBuffer;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        //先完成一个最简单的实现123，564，59
        for (int n = stringBuffer.lastIndexOf(".")-3;n>0;n-=3){
            stringBuffer = stringBuffer.insert(n,",");
        }
        System.out.println(stringBuffer);

    }
}
