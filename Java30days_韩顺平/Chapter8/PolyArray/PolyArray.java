package Java30days_韩顺平.Chapter8.PolyArray;

public class PolyArray {
    public static void main(String[] args) {
        Person persons[] = new Person[5];
        persons[0] = new Person("Jack",20);
        persons[1] = new Student("Jack",18,100);
        persons[2] = new Student("Smith",18,30);
        persons[3] = new Student("King",50,25000);
        persons[4] = new Student("Scott",30,20000);
        for (int i =0;i< persons.length;i++){
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student ){
                //方法study使用时，前面的属性需要加括号
                ((Student)persons[i]).study();
            }
            else if (persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }
            else{
                System.out.println("");;
            }

        }

    }
}
