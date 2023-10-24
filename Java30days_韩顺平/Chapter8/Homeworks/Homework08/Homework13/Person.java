package Java30days_韩顺平.Chapter8.Homeworks.Homework13;

public class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name,int age,char gender){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String play(){
        return this.name+"爱玩";
    }
    public String basicInfo(){
        return "姓名："+this.name+"\n年龄："+age+"\n性别："+gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
