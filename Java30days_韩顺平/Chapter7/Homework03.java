package Java30days_韩顺平.Chapter1to6;

public class Homework03 {
    public static void main(String[] args){

        Book t1 =new Book("飘",230.0);
        t1.info();
        t1.updatePrice();
        t1.info();
    }
}
class Book{
    String name;
    double price;
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        //如果方法中，没有price局部变量，this.price等价price
        if (this.price>150){
            this.price=150;
        }else if(this.price>100){
            this.price=100;
        }else {}
    }
    //显示书籍的情况
    public void info(){
        System.out.println("书名:"+this.name+"\n价格:"+this.price);
    }

}
