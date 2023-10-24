package Java30days_韩顺平.Chapter8.Homeworks.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person person = new Person("maria", 29, '女');
        Student student1 = new Student("maria", 29, '女', "2345678");
        Student student2 = new Student("lora", 21, '女', "23453578");
        student1.printInfo();

        Teacher teacher1 = new Teacher("lucy", 34, '女', 5);
        Teacher teacher2 = new Teacher("tom", 44, '男', 8);
        teacher1.printInfo();

        Person[] people = new Person[4];
        people[0] = student1;
        people[1] = teacher1;
        people[2] = student2;
        people[3] = teacher2;

        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(people);

        System.out.println("===========排序后的数组===========");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("===========text方法===========");
        for (int i = 0; i < people.length; i++) {
            homework13.test(people[i]);
        }


    }
    public void test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {}
    }

    public void bubbleSort(Person[] people) {
        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }

            }
        }

    }
}


