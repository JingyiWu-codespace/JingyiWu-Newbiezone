package Java30days_韩顺平.Chapter19.Transformation;

import java.io.*;

public class OutputStreamWriter_ {
    //把fileoutputstream字节流转成字符流outputstreamwriter
    public static void main(String[] args) throws IOException {
        String filePath="/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/try.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"utf-8");
        //osw.write("小吴加油版");
        //osw.close();
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("小吴加油");
        bw.close();

        System.out.println("保存成功");

    }
}
