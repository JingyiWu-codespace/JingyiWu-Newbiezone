package Java30days_韩顺平.Chapter15.GenericExercise;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        Student student1 = new Student("小红",14);
        Student student2 = new Student("小明",15);
        Student student3 = new Student("小蓝",13);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student student:students){
            System.out.println(student);
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Map <String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("小红",14);
        hashMap.put("小明",15);
        hashMap.put("小蓝",13);
        Set keySet = hashMap.keySet();
        Set <Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String,Integer> next = iterator1.next();
            next.getValue();
            next.getKey();
        }

        for (Object key:keySet){
            System.out.println(key+"-"+hashMap.get(key));
        }
        for (Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry);

        }


    }
}
class Student{
    public String name;
    public int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}