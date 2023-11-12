package Java30days_韩顺平.Chapter15.GenericExercise02;

import org.jetbrains.annotations.NotNull;

public class Employee {
    private String name;
    private double sal;
    private MyDate birthdaty;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthdaty = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthdaty() {
        return birthdaty;
    }

    public void setBirthdaty(MyDate birthdaty) {
        this.birthdaty = birthdaty;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthdaty=" + birthdaty +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public int compareTo(@NotNull MyDate o) {
        int yearMinus = year-o.getYear();
        if (yearMinus!=0){return yearMinus;}
        int monthMinus = month-o.getMonth();
        if (monthMinus!=0){return monthMinus;}
        return day-o.getDay();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "" + day +
                "/" + month +
                "/" + year
                ;
    }
}