package Java30days_韩顺平.Chapter8.Homeworks.Homework01;

public class BubbleSortOOP {
    public static void main(String[] args) {
        Person persons[] = new Person[3];
        persons[0] = new Person("JENNIE", 24, "SE");
        persons[1] = new Person("JACK", 23, "QA");
        persons[2] = new Person("MARC", 26, "SE");
        //输出当前对象数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认调对象的toString方法
        }
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                //如果要求名字长度
                //if (persons[j].getName().length()>persons[j+1].getName().length())

                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }

        }
        System.out.println("排序之后的效果:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默认调对象的toString方法
        }
    }
}
