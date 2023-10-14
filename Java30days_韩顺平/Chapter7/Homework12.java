package Java30days_韩顺平.Chapter1to6;

public class Homework12 {
    public static void main(String[] args){

        System.out.println();

    }
}
class Employee {
    String name;
    char gender;
    int age;
    String position;
    double salary;
    //要求复用构造器，所以要使用调用构造器的方法
    //所以先从少的开始写
    public Employee(String position,double salary){
        this.position = position;
        this.salary = salary;
    }
    public Employee(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //构造器中使用this使用其他构造器的参数，必须放在构造器里面的第一句
    public Employee(String position,double salary,String name,char gender,int age){
        this(name,gender,age);//用this调用另一个构造器
        this.position = position;
        this.salary = salary;
    }
}