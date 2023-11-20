package Java30days_韩顺平.Chapter19.FileOutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        //创建fileOutputStream对象
        //1. new FileOutputStream(filePath)创建方式，当写入内容时，会覆盖原来的内容
        //2. new FileOutputStream(filePath,true)创建方式，当写入内容时，是追加到文件后
        //写入一个字节
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/a.txt";
        try {
            //得到fileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('i');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void writeFile02(){
        //写入一个字符串
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/a.txt";
        try {
            //得到fileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            String str = "hello world miss wu";
            //把字符串转化为字符数组
            fileOutputStream.write(str.getBytes());
            //write (byte[]b,int off,int length)
            //将字节从位于偏移量off的指定字节数组写入此文件输出流
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
