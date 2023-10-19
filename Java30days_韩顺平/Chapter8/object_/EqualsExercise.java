package Java30days_韩顺平.Chapter8.object_;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack",10,'男');
        Person person2 = new Person("jack",10,'男');
        System.out.println(person1.equals(person2));
    }
}
class Person{
    private String name;
    private int age;
    private char gender;
    //重写equals的方法
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            //向下转型，得到obj的属性
            Person p = (Person)obj;
            return this.name.equals(p.name)&&this.age == p.age&&this.gender==p.gender;

        }
        return false;

    }

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
