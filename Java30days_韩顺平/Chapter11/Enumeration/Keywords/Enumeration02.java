package Java30days_韩顺平.Chapter11.Enumeration.Keywords;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.WINTER);
    }
}
enum Season{
    SPRING("春天","温暖"),
    WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),
    SUMMER("夏天","寒冷");

    private String name;
    private String desc;
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
