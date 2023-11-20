package Java30days_韩顺平.Chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file = new File("/Users/jingyiwu/IdeaProjects/Java/news4.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("文件名字="+file.getName());
        System.out.println("绝对路径="+file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小：（字节）"+file.length());
        System.out.println("文件是否存在="+file.isFile());
        System.out.println("是不是目录="+file.isDirectory());
    }
}
