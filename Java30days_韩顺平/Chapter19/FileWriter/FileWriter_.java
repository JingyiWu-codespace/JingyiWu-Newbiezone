package Java30days_韩顺平.Chapter19.FileWriter;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void fileWriter01(){
        FileWriter fileWriter = null;
        String filePath="/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write("风雨之后，定见彩虹");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("程序结束");
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
