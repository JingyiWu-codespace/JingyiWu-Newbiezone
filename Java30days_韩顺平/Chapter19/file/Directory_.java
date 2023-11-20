package Java30days_韩顺平.Chapter19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }
    //在java编程中，目录也被当作文件
    public void m2(){
        String filePath = "/Users/jingyiwu/IdeaProjects/Java";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }
    @Test
    public void m3(){
        String dirPath = "/Users/jingyiwu/IdeaProjects/Java/news";
        File dir = new File(dirPath);
        if (dir.exists()) {
            System.out.println("目录存在");
        } else {
            if(dir.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }

        }
    }

}

