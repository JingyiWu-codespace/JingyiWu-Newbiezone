package Java30days_韩顺平.Chapter19.Writer_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferedWriter_ {
    public static void main(String[] args) {
        String line;
        //如果以追加的方式创建new FileWriter(filePath,true)
        //覆盖的方式new FileWriter(filePath)
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write("小吴别哭，一定能找到sde的工作，薪资也符合预期！\n");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void readerFile() throws IOException {
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));///
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
    }
}
