package Java30days_韩顺平.Chapter13.Arrays;

public class Book {
    private String name;
    private int price;
    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = this.price;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
