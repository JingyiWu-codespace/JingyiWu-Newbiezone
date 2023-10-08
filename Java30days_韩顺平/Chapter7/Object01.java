package Java30days_韩顺平.Chapter7;

import javax.xml.catalog.Catalog;
//如何创建对象
//1.先声明再创建
//      Cat cat1;
//      cat1 = new Cat();
//2. 直接创建
//      Cat cat1 = new Cat();
//3.赋值与输出 cat1.age;
public class Object01 {
    public static void main(String[] args) {
        //使用面向对象的方式来解决养猫问题
        //实例化一只猫（创建一只猫对象）

        //1. new Cat()创建一只猫
        //2. 把创建的猫赋值给cat1
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        //第二只猫猫，并赋值给cat2
        //cat2 是对象名
        //new Cat()创建的对象空间(数据)才是真正的对象
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        System.out.println("第一只猫猫的信息: " + cat1.name + " " + cat1.age + " " + cat1.color);
        System.out.println("第二只猫猫的信息: " + cat2.name + " " + cat2.age + " " + cat2.color);

    }
}
        class Cat {
            //属性=成员变量=field(字段)
            //属性的定义类型可以是任意类型：基本数据类型，也可以是引用类型（对象、数组）
            //属性的定义语法： 访问修饰符 属性类型 属性名；
            //4种访问修饰符public protected private default
            //属性如果不赋值有默认值，规则和数组一致
            String name;
            int age;
            String color;
            double weight;
        }

