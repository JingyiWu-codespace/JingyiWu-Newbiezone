package Java30days_韩顺平.Chapter8.encap;

public class Encapsulation01 {
    //1. 不能随便查看年龄、工资；
    //2. 并对年龄进行合理验证（1-120之间）
    //3. name的长度在2-6之间
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("jacvkvkvkvkk你好吗mnbvcxz");
        p.setAge(25);
        p.setSalary(1000);
        System.out.println(p.info());
    }


}

class Person {
    public String name;
    private int age;
    private double salary;

    public void setName(String name) {
        if (name.length() >=2 &&  name.length() <= 6 ) {
            this.name = name;
        } else {
            System.out.println("名字超出超出限制，请重新输入");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 120) {
            this.age = age;
        } else {
            this.age = 18;
            System.out.println("请输入正确年龄");
        }

    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String info() {
        return "name:" + name + " " + "age:" + age + " " + "salary:" + salary;
    }
}
