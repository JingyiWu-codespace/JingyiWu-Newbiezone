package Java30days_韩顺平.Chapter23.ClassTest;

import Java30days_韩顺平.Chapter15.Homework.User;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;

public class ClassTest {
    //读取Class实例的几种方式(掌握前三种)
    @Test
    public void test1() throws ClassNotFoundException {
        //1.调用运行时类的静态属性: class
        Class clazz1 = User.class;
        //2. 调用运行时类的对象的getClass()方法
        User u1 = new User();
        Class clazz2 = u1.getClass();

        System.out.println(clazz1 == clazz2);
        /*clazz1首次使用，加载进入方法区，缓存起来
          clazz2调用时，直接从方法区里寻找，在缓存中使用
          javaGC的垃圾处理机制，主要针对于堆
         */

        //3.调用Class的静态方法forName(String className)，平常使用的比较多，因为最灵活
        String className = "Java30days_韩顺平.Chapter15.Homework.User";//全类名
        Class clazz3 = Class.forName(className);

        //4. 用类的加载器的方式 (3与4差不多，掌握其中一个方式就好了)
        ClassLoader.getSystemClassLoader().loadClass("Java30days_韩顺平.Chapter15.Homework.User");

    }

    public void test2() {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;
        int[]a = new int[10];
        int[]b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        //只要元素类型与维度一样就是同一个Class，所以c10和c11是一样的Class
    }
}
