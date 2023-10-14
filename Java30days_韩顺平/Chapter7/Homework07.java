package Java30days_韩顺平.Chapter1to6;

public class Homework07 {
    public static void main(String[] args){
        Dog dag1 = new Dog("小虎",3,"白色");
        Dog dag2 = new Dog("袁义薛",29,"黄色");
        dag2.show();
    }
}
class Dog{
    String name;
    int age;
    String color;
    public Dog(String name,int age,String color){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.age);
    }
}
