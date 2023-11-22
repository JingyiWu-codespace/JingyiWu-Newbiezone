package Java30days_韩顺平.Chapter19.Homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties dogProperties = new Properties();
        dogProperties.setProperty("name","tom");
        dogProperties.setProperty("age","5");
        dogProperties.setProperty("color","red");
        String filePath= "src/dogProperties";
        //dogProperties.load(new FileReader(filePath));
        dogProperties.store(new FileOutputStream(filePath),null);

        Object dog = new Dogs(dogProperties.getProperty("name"),Integer.parseInt(dogProperties.getProperty("age")), dogProperties.getProperty("color"));
        System.out.println(dog);
        String filePath2  = "src/dog.dat";
        ObjectOutputStream oos;
        oos = new ObjectOutputStream(new FileOutputStream(
                filePath2));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象序列化完成");
        // 在反序列化回来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath2));
        //读对象用readObject就行了
        Dogs newDog = (Dogs) ois.readObject();
        System.out.println(newDog);
        ois.close();


    }
}

