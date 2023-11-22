package Java30days_韩顺平.Chapter19.Properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02_ {
    public static void main(String[] args) throws IOException {
        //使用Properties类来读取mysql.properties文件
        //1.创建
        Properties properties = new Properties();
        properties.load(new FileReader("src/mysql.properties"));
        //把k-v显示至控制台
        properties.list(System.out);
        //根据key获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);



    }
}
