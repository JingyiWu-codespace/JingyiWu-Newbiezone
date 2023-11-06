package Java30days_韩顺平.Chapter14.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("张三丰");
        list1.add("贾宝玉");
        list1.add(1,"小吴");
        //插入方法，选择索引将信息插入

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list1.addAll(1 ,list2);
        System.out.println(list1);
        //将第二个元素，加入第一个元素中
        System.out.println(list1.indexOf("tom"));
        //返回该字符串的第一次索引
        System.out.println(list1.lastIndexOf("tom"));
        //返回该字符串的最后一次索引
        list1.remove(0);
        //删除对应索引的值
        list1.set(1,"玛丽");
        //更像查找替换
        List returnlist = list1.subList(0,2);
        //注意返回的子集合，fromIndex <= subList < toIndex
        System.out.println( returnlist);
        System.out.println(list1);
    }
}
