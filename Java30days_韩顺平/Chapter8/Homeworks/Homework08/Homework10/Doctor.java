package Java30days_韩顺平.Chapter8.Homeworks.Homework10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        //判断object是否是doctor的类型或子类
        if (!(object instanceof Doctor)){
            return false;
        }
        Doctor doctor = (Doctor)object;
        return this.name.equals(((Doctor) object).name)&&
                this.age==((Doctor) object).age&&
                this.job.equals(((Doctor) object).job)&&
                this.gender==((Doctor)object).gender&&
                this.salary==((Doctor)object).salary;
    }

}
