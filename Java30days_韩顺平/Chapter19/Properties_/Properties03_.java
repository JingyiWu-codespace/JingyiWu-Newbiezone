package Java30days_韩顺平.Chapter19.Properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03_ {
    public static void main(String[] args) throws IOException {
        //使用proerties类来创建配置文件或修改配置文件内容
        /*
        properties 父类是hashtable，底层就是hashtable
        if(value==null){
          throw new NullPointerException();
        }
         */
        Properties properties = new Properties();
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");
        //中文会转变成unicode码，不是乱码
        properties.setProperty("pwd","abc-11");
        properties.setProperty("pwd","888");
        //将k-v存储到文件就好了
        properties.store(new FileOutputStream("src/mysql2.properties"),null);
        //null的位置是注释
        System.out.println("保存配置文件成功");
        //如果该文件没有key就是创建
        //如果该文件有key就是修改





    }
}
