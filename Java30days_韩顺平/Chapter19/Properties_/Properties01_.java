package Java30days_韩顺平.Chapter19.Properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01_ {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到ip、user、password
        BufferedReader br = new BufferedReader(new FileReader("src/mysql.properties"));
        String line = "";
        while ((line = br.readLine())!=null){//循环读取
            String[]split = line.split("=");
            //如果我们需要指定字段
            if("ip".equals(split[0])){
            System.out.println(split[0]+" "+split[1]);
        }}
        br.close();
    }
}
