package Java30days_韩顺平.Chapter14.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExercise {

    public static void main(String[] args) {
        Dog dog1 = new Dog("小毛",3);
        Dog dog2 = new Dog("小花",7);
        Dog dog3 = new Dog("小袁",30);
        Collection list = new ArrayList(3);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        //增强for循环
        for (Object dog:list){
            System.out.println(dog);
        }
        //迭代器循环
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object dog = iterator.next();
            System.out.println("obj"+dog);
        }

    }


}
class Dog{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name ;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}