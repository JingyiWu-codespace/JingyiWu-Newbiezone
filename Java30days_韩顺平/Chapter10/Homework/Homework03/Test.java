package Java30days_韩顺平.Chapter10.Homework.Homework03;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat (); //向上转型，父类编译类型指向子类对象
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }


}
