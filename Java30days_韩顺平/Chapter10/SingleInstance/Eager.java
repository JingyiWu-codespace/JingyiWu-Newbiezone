package Java30days_韩顺平.Chapter10.SingleInstance;

//单例模式练习
//保证本类只有一个实例对象
//在Cat类中，使用静态的方法创建对象
//所以在main方法中我们不能new 新对象（由于构造器的私有化）
//在Cat类中提供一个公共静态类的方法，让大家可以通过类名来调用此方法从而达到访问对象的目的
public class Eager {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();

        //直接调用Cat类的静态方法
        System.out.println(cat);
    }
}

class Cat{
    private static String name;
    private static Cat cat = new Cat("团团");
    private Cat(String name){
        this.name = name;
    }
    public static Cat getInstance(){
        return cat;
    }
    public String toString(){
        return "GrilFriend_"+"name"+name;
    }
}
