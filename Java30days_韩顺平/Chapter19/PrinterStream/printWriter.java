package Java30days_韩顺平.Chapter19.PrinterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        //输出重定向
        PrintWriter printWriter1 =new PrintWriter(new FileWriter("/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/print.txt"));
        printWriter.print("后悔吗？");
        printWriter1.println("当水货不好吗？");
        //如果不关闭，文件不会写入，writer的特性，一定要关闭，close是刷新 也可以用flush
        printWriter.close();
        printWriter1.close();
    }
}
