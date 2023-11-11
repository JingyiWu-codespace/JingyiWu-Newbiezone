package Java30days_韩顺平.Chapter14.Homework.Homework01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList newsList = new ArrayList();
        News news1 = new News("最近双十一购买欲很强，想回家家，24岁女子依然啃老");
        News news2 = new News("今天比利时下雨，很突然，本来想去超市，难过，但是天气晴朗了");
        newsList.add(news1);
        newsList.add(news2);
        //倒叙方法1,普通遍历
//        for (int i = newsList.size() - 1; i >= 0; i--) {
//            News news= (News) newsList.get(i);
//            System.out.println(processTitle(news.getTitle()));
//        }
        //倒叙方法2， 重写comparator

        newsList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                News news1 = (News) o1;
                News news2 = (News) o2;
                char firstLetter1 = news1.getTitle().charAt(0);
                char firstLetter2 = news2.getTitle().charAt(0);
                return firstLetter1-firstLetter2;

            }
        });
        //截取字符串第一种方法，遍历
        Iterator iterator = newsList.iterator();
        while (iterator.hasNext()) {
            News next = (News) iterator.next();
            if (next.getTitle().length() > 15) {
                System.out.println(next.getTitle().substring(0, 14) + "...");
            }
        }
        //截取字符串第二种方法，新建方法
    }

    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0, 14) + "....";
        } else return title;
    }
}
