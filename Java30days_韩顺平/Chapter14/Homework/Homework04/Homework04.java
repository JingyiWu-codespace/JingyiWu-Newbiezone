package Java30days_韩顺平.Chapter14.Homework.Homework04;
//试分析HashSet和TreeSet如何实现去重的
/*
* 1. HashSet的去重机制：
* hashCode()+equals，底层先通过存入对象进行计算，得到哈希值，
* 通过哈希值得到对应的索引，如果发现table的索引位置没有数据，直接存放。
* 如果有数据，就进行equals比较[遍历比较]，如果比较后，不相同，就加入，相同就不加入
* 2. TreeSet的去重机制：
* 如果你传入了一个Comparator的匿名对象，就使用实现的compare去重
* 如果方法返回0，就认为是相同的元素/数据，不添加。
* 如果没有传入Comparator匿名对象，则以你添加的对象实现的Compareable接口的compareTo去重
*
 */

import java.util.TreeSet;

public class Homework04 {
    public static void main(String[] args) {
        //以下代码抛出异常的原因：
        /*
        ** 因为TreeSet()构造器没有传入Camparator接口的匿名内部类
        * 所以在底层Comparable<? super K>k1) = (Comparables <? super K>)key;
        * 将k转成Comparable的接口类型，注意实现接口的类，可以向上转型为接口类型
        * 即 把Person转成Camparable类型
        * person对象也没有实现comparable的接口，所以没有compareTo方法去重
         */

        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
    }

}
class Person{}
