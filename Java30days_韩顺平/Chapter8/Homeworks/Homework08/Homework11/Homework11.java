package Java30days_韩顺平.Chapter8.Homeworks.Homework11;

public class Homework11 {
    public static void main(String[] args) {
        Person jack = new Student("Jack"); //向上转型
        jack.eat();
        Student jackstudent = (Student)jack;//向下转型
        jackstudent.study();
    }
}
