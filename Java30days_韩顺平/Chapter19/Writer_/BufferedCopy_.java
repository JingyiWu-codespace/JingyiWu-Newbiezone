package Java30days_韩顺平.Chapter19.Writer_;

import java.io.*;

public class BufferedCopy_ {
    //1. bufferreader/bufferwriter 是按照字符读取
    // 2. 不要用此操作二进制文件！会导致文件损坏！
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String srcPath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/reader.txt";
        String desPath = "/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/reader.txt";
        String line;
        try {
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(desPath));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                //没读取一行，没有换行服
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
