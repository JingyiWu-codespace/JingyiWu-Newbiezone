package Java30days_韩顺平.Chapter14.Homework.Homework02;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1= new Car("宝马","40000000");
        Car car2= new Car("宾利","50000000");
        Car car3= new Car("奔驰","23456789");
        //add
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        System.out.println(arrayList);
        //remove
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.remove(car3));
        //contains
        System.out.println(arrayList.contains(car2));
        //size
        System.out.println(arrayList.size());
        //isEmpty
        System.out.println(arrayList.isEmpty());
        //clear
        arrayList.clear();
        //addAll
        arrayList.addAll(arrayList);
        //containAll
        arrayList.contains(arrayList);
        //removeAll
        arrayList.removeAll(arrayList);
        //enhance for  loop
        for(Object car:arrayList){
            System.out.println(car);
        }
        // iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Car car = (Car)iterator.next();
            System.out.println(car);
        }
    }
}
