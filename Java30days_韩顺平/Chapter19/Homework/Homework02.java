package Java30days_韩顺平.Chapter19.Homework;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/a.txt";
        //BufferedReader br = new BufferedReader(new FileReader(filePath));
        FileInputStream fis = new FileInputStream(filePath);
        //指定编码版
        BufferedReader br = new BufferedReader(new InputStreamReader(fis,"utf-8"));
        String line = " ";
        int i = 0;
        while ((line = br.readLine())!=null){
            System.out.println(++i+" "+line);

        }if (br!=null){
            br.close();
        }
    }
}
