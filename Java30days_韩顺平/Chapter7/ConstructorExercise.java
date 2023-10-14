package Java30days_韩顺平.Chapter7;

public class ConstructorExercise {
    public static void main(String[] args){
        Person1 p1=new Person1();//无参构造器
        System.out.println(p1.name+" "+p1.age);
        Person1 p2 = new Person1("ok",10);
        System.out.println(p2.name+" "+p2.age);

    }
}
class Person1 {
    String name;
    int age;
    //无参数构造器
    public Person1(){
        age = 18;
    }
    public Person1(String pName, int pAge){
        name =pName;
        age=pAge;
    }
}