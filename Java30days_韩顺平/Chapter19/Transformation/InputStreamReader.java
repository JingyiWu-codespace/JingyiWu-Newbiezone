package Java30days_韩顺平.Chapter19.Transformation;

import java.io.*;

public class InputStreamReader {
    //使用InputStreamReader转换流解决中文乱码问题
    //将字节流FileInputStream 转换成字符流
    //InputStreamReader 指定编码gbk/utf-8
    public static void main(String[] args) throws IOException {
        String filePath="/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        java.io.InputStreamReader isr = new java.io.InputStreamReader(new FileInputStream(filePath),"utf-8");
        //1. new FileInputStream 转成InputStreamReader
        //2. 指定编码gbk
        //3. 把InputStreamReader传入bufferedStreamReader
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
        br.close();


    }

}
