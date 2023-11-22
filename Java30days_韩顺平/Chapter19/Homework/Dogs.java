package Java30days_韩顺平.Chapter19.Homework;

import java.io.Serializable;

public class Dogs implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dogs(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
