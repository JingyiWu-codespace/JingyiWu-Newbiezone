package Java30days_韩顺平.Chapter7;

public class Object03 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age =10;
        p1.name = "小明";
        Person p2 = p1;//把p1赋给了p2，让p2指向了p1
        p1.age = 80;
        System.out.println(p2.age);
    }
}
class Person{
    int age;
    String name;
}