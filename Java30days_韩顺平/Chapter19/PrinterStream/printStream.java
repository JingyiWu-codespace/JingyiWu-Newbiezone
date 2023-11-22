package Java30days_韩顺平.Chapter19.PrinterStream;

import java.io.IOException;
import java.io.PrintStream;

public class printStream {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.println("hello world");
        //在默认情况下printStream 输出数据的位置是标准输出——显示器

        //print底层使用是write，所以也可以直接调用write方法打印
        out.write("略略略".getBytes());//一样的，只不过按照字节打印，因为printStream是字节流
        out.close();
        //我们可以去修改打印流输出流的位置/设备
        System.setOut(new PrintStream("/Users/jingyiwu/IdeaProjects/Java/src/Java30days_韩顺平/Chapter19/print.txt"));
        System.out.println("转换成功了吗");
    }
}
