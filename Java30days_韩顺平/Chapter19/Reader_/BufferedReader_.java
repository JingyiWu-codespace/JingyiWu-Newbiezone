package Java30days_韩顺平.Chapter19.Reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //读取
        String line;//按行读取，效率高
        //返回null时表示读取完毕
        while(true){
            try {
                if (!((line = bufferedReader.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
        //关闭流，只关闭bufferreader就可以了，因为底层会自动关闭节点流
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
