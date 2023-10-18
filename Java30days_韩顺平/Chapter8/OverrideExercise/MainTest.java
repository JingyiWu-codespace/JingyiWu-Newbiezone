package Java30days_韩顺平.Chapter8.OverrideExercise;
public class MainTest {
    public static void main(String[] args){
        Person person = new Person("小吴",24);
        System.out.println(person.say());
        Student student = new Student("小吴",24,"小馄饨不放辣",100);
        System.out.println(student.say());
    }
}
class Person {
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
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "名字："+name+" "+"年龄："+age;
    }
}
class Student extends Person{
    private double score;
    private String id;
    public Student(String name, int age, String id, double score){
        super(name,age);
        this.id = id;
        this.score = score;
    }
    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return  score;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public String say(){
        return super.say()+" "+"分数："+score+" "+"ID:"+id;
    }
}
