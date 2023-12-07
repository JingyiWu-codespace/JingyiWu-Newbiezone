package Java30days_韩顺平.Chapter23.ReflecIntro;


import Java30days_韩顺平.Chapter10.Homework.Homework06.Person;
import Java30days_韩顺平.Chapter10.Homework.Homework06.Vehicles;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionIntro {
    public static void main(String[] args) throws IOException {
    }
    @Test
    public void test3() throws Exception{
        //1. 调用的构造器，创建Person实例
        Class clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class, Vehicles.class);
        cons.setAccessible(true);
        Person p1 = (Person) cons.newInstance("Tom", new Vehicles() {
            @Override
            public void work() {
                System.out.println("dudu");
            }
        });
        //2. 调用私有的属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Jerry");
        System.out.println(nameField.get(p1));

        //3. 调用方法
        Method methodField = clazz.getDeclaredMethod("blessWord");
        methodField.setAccessible(true);
        System.out.println(methodField.invoke(p1));
    }
}
