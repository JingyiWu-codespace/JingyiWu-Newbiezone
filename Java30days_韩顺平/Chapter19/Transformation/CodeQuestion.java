package Java30days_韩顺平.Chapter19.Transformation;

public class CodeQuestion {
    public static void main(String[] args) {
        //读取中文文件会出现乱码 InputStreamReader
        //转换流 把字节流转化为字符流
        //默认情况下，读取文件是按照utf-8编码
        //会有文件乱码问题，有时需要指定读取文件编码方式
        //字节流可以指定编码方式,在把字节流转化字符流，解决了乱码问题
    }
}
