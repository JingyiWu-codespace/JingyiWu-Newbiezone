package Java30days_韩顺平.Chapter19.FileReader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
    }
    @Test
    public void readFile01(){
        //1. 创建一个filereader对象
        FileReader fileReader = null;
        int data = 0;
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        try {
            fileReader = new FileReader(filePath);
            //循环读取read，单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void readFile02(){
        System.out.println("==========按照字符数来读取========");
        //使用字符数组来读取文件
        FileReader fileReader = null;
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        int readLen = 0;
        char[]buf = new char[8];

        try {
            fileReader = new FileReader(filePath);
            while((readLen = fileReader.read(buf))!=-1){
                //返回的是实际读取的字符数
                //如果返回-1，说明文件结束
                System.out.print(new String(buf,0,readLen));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
