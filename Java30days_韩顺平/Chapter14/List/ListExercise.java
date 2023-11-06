package Java30days_韩顺平.Chapter14.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0;i<12;i++){
            list.add("hello"+i);
        }
        list.add(1,"韩顺平教育");
        list.get(4);
        list.remove(5);
        list.set(6,"我好困");
        //迭代器遍历循环
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}

