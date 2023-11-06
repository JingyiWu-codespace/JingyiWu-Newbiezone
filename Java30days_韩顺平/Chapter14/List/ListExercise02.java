package Java30days_韩顺平.Chapter14.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Book book1 = new Book("红楼梦",100,"曹雪芹");
        Book book2 = new Book("西游记",210,"吴承恩");
        Book book3 = new Book("水浒传",9,"施耐庵");
        list.add(book1);
        list.add(book2);
        list.add(book3);


        //如何对集合排序
        for (Object o :list){
            System.out.println(o);
        }
        sort(list);
        System.out.println("===排序后===");
        for (Object o :list){
            System.out.println(o);
        }
    }

    public static void sort(List list){
        for(int i=0;i<list.size()-1;i++){
            for(int j = 0; j<list.size()-1-i;j++){
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()> book2.getPrice()){//交换用set方法
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book{
    private String name;
    private double price;
    private String author;
    public Book(String name,double price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t" +
                "\t"+"价格：" + price + "\t"+
                "\t"+"作者: " + author + "\t" ;
    }
}

