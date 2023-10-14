package Java30days_韩顺平.Chapter7;

public class TestPerson {
    public static void main (String[] args){
        PersonForThis personTest1 = new PersonForThis("marry",18);
        PersonForThis personTest2 = new PersonForThis("smith",18);
        System.out.print(personTest1.compareTo(personTest2));


    }
}
class PersonForThis{
    String name;
    int age;
    public PersonForThis(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(PersonForThis p){
        if (this.name.equals(p.name)&&this.age==p.age){
            return true;
        }
        else return false;
    }
}


