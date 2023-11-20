package Java30days_韩顺平.Chapter19.FileInputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        //单个字节的读取，效率比较低
        //——>优化为 使用read(byte[]b)
        int readData = 0;
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/helloworld.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节数据。如果没有输入可用，此方法将阻止
            //返回-1，表示没有字节可以读了
            while((readData = fileInputStream.read())!=-1){
                System.out.print((char)readData);
            };
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void readFile02(){
        int readData = 0;
        byte[]buf = new byte[8];
        int readLen = 0;
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/helloworld.txt";
        FileInputStream fileInputStream = null;
            try {
                //创建FileInputStream 对象，用于读取文件
                fileInputStream = new FileInputStream(filePath);
                //从该输入流最多读取b.length字节的数据到字节数组
                //如果返回-1，表示读取完毕
                //如果读取正常，返回实际读取的字节数
                while ((readLen=fileInputStream.read(buf))!=-1){
                    System.out.print(new String(buf,0,readLen));
                }
            }  catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }

    }


