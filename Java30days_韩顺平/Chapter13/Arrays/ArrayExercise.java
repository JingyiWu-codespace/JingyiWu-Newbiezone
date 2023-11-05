package Java30days_韩顺平.Chapter13.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦", 100);
        book[1] = new Book("金瓶梅新", 90);
        book[2] = new Book("青年文摘20年", 5);
        book[3] = new Book("Java从入门到放弃", 300);

        //对书籍的价格从小到大排序
        //换成从大到小就调换一下返回值1和-1的顺序
        Arrays.sort(book, new Comparator() {
            //这里你对Book数字排序
            @Override
            public int compare(Object o1, Object o2) {
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                int priceDiff = i1.getPrice() - i2.getPrice();
                if (priceDiff > 0) {
                    return 1;
                } else if (priceDiff < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(book));

        //对书籍的名字长度从大到小排序
        Arrays.sort(book, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book)o1;
                Book b2 = (Book)o2;
                int nameLength = b2.getName().length()-b1.getName().length();
                return nameLength;
            }
        });
        System.out.println(Arrays.toString(book));

    }
}

