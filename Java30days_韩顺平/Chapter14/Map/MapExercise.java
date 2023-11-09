package Java30days_韩顺平.Chapter14.Map;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        //可以试试instanceof判断运行类型
        Map hashMap = new HashMap();
        hashMap.put(1, new Staff("小黄", 18983));
        hashMap.put(2, new Staff("小蓝", 58983));
        hashMap.put(3, new Staff("小绿", 8983));
        System.out.println("第一种遍历方式：取出所有Key，通过Key取出对应的Value");
        Set keySet = hashMap.keySet();
        System.out.println("工资大于18000的员工");
        for (Object key : keySet) {
            Staff info= (Staff) hashMap.get(key);

            if (info.getSalary()>18000){
                System.out.println(info);
            }
        }
        System.out.println("==========");
        System.out.println("第二种遍历方式：通过迭代器取出所有的value");
        Collection values = hashMap.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            Object value = iterator.next();
            Staff info = (Staff)value;
            if (info.getSalary()>18000){
                System.out.println(info);
            }
        }
        System.out.println("============");
        System.out.println("第三种方式：通过 K,V的方式去获取");
        Set entry = hashMap.entrySet();
        for (Object obj : entry){
            Map.Entry m = (Map.Entry) obj;
            Staff info = (Staff) m.getValue();
            if (info.getSalary()>18000){
                System.out.println(info);
            }
        }
        System.out.println("============");
        System.out.println("第三种方式迭代器：通过 K,V的方式去获取");
        Iterator iterator1 = entry.iterator();
        while (iterator1.hasNext()){
            Map.Entry m = (Map.Entry) iterator1.next();
            Staff info = (Staff) m.getValue();
            if (info.getSalary()>18000){
                System.out.println(info);
            }
        }



    }
}


class Staff {
    private String name;
    private double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
