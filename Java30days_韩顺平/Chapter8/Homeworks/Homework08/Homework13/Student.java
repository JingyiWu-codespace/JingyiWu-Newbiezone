package Java30days_韩顺平.Chapter8.Homeworks.Homework13;

public class Student extends Person {
    private String studentNumber;
    public Student(String name, int age, char gender,String studentNumber){
        super(name,age,gender);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String play(){
        return super.play()+"足球";
    }
    public void study() {
        System.out.println(getName()+"承诺 我会 好好学习");
    }
    public void printInfo(){
        System.out.println("学生的信息");
        System.out.println(super.basicInfo());
        System.out.println("学号："+this.studentNumber);
        study();
        System.out.println(play());
        System.out.println("===============");

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                '}'+
                super.toString();
    }
}
