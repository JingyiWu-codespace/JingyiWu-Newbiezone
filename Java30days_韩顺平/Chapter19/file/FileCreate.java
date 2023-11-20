package Java30days_韩顺平.Chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String filePath = "\\news.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方式2 new File (File parent, String child)
    //根据父目录文件+子路径构建
    //  /Users/jingyiwu/IdeaProjects/Java
    @Test
    public void create02(){
        File parentFile  = new File("/Users/jingyiwu/IdeaProjects/Java");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方式3 new File(String parent, String child)
    public void create03(){
        String parent="/Users/jingyiwu/IdeaProjects/Java";
        String child = "news2.txt";
        File file = new File(parent,child);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

