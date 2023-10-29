package Java30days_韩顺平.Chapter10.SingleInstance;
/*懒汉式也是单例模式的一种
 他在需要调用对象时，才创建对象

 */
public class Lazy {
    public static void main(String[] args) {
        System.out.println(Dog.getInstance());
    }
}
class Dog{
    private String name;
    private static Dog dog;
    private Dog(String name){
        this.name = name;
    }
    public static Dog getInstance (){
        if (dog == null){
            dog = new Dog("圆圆狗");
        }
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
