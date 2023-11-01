package Java30days_韩顺平.Chapter12.Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException {
    public static void main(String[] args) {

        try{
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len=fis.read())!=-1){
                System.out.println(len);
            }
            fis.close();
        }
        catch(IOException e){
            e.printStackTrace();
            e.getMessage();
        }
    }

}
