package Java30days_韩顺平.Chapter14.List;

import java.util.*;

public class ListFor {
    public static void main(String[] args) {

        //List 接口的实现子类Vector LinkedList
        List list = new Vector();
        //List list = new LinkedList();
        //List list = new ArrayList();
        list.add("锅包肉");
        list.add("鸡公煲");
        list.add("粗来面");
        list.add("麻辣拌");
        list.add("砂锅面");

        System.out.println("=========iterate循环========");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========增强for循环========");
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println("=========普通for循环========");
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
