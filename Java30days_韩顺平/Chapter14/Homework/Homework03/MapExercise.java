package Java30days_韩顺平.Chapter14.Homework.Homework03;

import java.util.*;

public class MapExercise {
    public static <Collction> void main(String[] args) {
        Map map = new HashMap();
        map.put("jack",650); //这时会把int装箱为Integer放入map中
        map.put("tom",1200);
        map.put("smith",2900);
        //将jack的工资更改为2600
        map.put("jack",2600);
        //keySet方法取值
        Set keyset = map.keySet();
        Iterator iterator = keyset.iterator();
        for(Object key : keyset){
            System.out.println(key);
        }
        //将员工工资统一增加100
        for(Object key : keyset){
            //map.get(key)返回类型是object(get方法返回就是object)，
            // 所以要向下转型
            System.out.println(map.get(key).getClass());
            map.put(key,(Integer)map.get(key)+100);

        }


        //entrySet方法取值
        Set entrySet = map.entrySet();
        //取出来是entry类
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
//            Object entry = iterator1.next();
//            Map.Entry entry1 = (Map.Entry)entry;
            //简便写法：
            Map.Entry entry1 = (Map.Entry)iterator1.next();
            System.out.println(entry1.getKey()+"-"+entry1.getValue());
        }
        //map的value都是Collection类
        Collection values = map.values();
        System.out.println(values);


    }
}
