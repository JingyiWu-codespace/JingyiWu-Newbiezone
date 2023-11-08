package Java30days_韩顺平.Chapter14.Set.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet1 = new HashSet();
        hashSet1.add(new Employee_("smith",2000,new Mydate(1999,1,6)));
        hashSet1.add(new Employee_("Marie",2000,new Mydate(1998,12,26)));
        hashSet1.add(new Employee_("smith",2000,new Mydate(1999,1,6)));
        for (Object o :hashSet1){
            System.out.println(o);
        }

    }
}
class Employee_{
    private String name;
    private double sal;
    private  Mydate birthday;
    public Employee_(String name,double sal,Mydate birthday){
        this.name = name;
        this.sal = sal;
        this.birthday = birthday ;
    }



    @Override
    public String toString() {
        return "Employee_{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee_ employee = (Employee_) object;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class Mydate {
    private int year;
    private int month;
    private int day;
    public Mydate(int year, int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Mydate mydate = (Mydate) object;
        return year == mydate.year && month == mydate.month && day == mydate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
