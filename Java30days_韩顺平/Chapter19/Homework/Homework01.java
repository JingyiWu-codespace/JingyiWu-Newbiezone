package Java30days_韩顺平.Chapter19.Homework;

import java.io.*;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String folderPath="/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19";
        File folder = new File(folderPath);
        File file = new File(folderPath,"hello.txt");
        if (!folder.exists()){
            folder.mkdirs();
        }
        if (!file.exists()){
            System.out.println("文件不存在");
            //BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            //bw.write("hello world");
            //bw.close();
            //这个方法可以直接创建嘿嘿，不用写入
            if (file.createNewFile()){
                System.out.println("创建成功");
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("hello world");
                bw.close();
            }else {
                System.out.println("创建失败");
            }
        }else{
            System.out.println("文件已存在");
        }
    }
}
