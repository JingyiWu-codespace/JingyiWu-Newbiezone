package Java30days_韩顺平.Chapter8.PolyArray;

public class Person {
    private String name;
    private int age;
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
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return name+"\t"+age;
    }
}
