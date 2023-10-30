package Java30days_韩顺平.Chapter11.Enumeration.Userdefine;

public class Enumeration_Userdefined {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
class Season{
    private String season;
    public String getSeason() {
        return season;
    }
    private String desc;
    public String getDesc() {
        return desc;
    }
    private Season(String season,String desc){
        this.desc = desc;
        this.season = season;
    }
    //定义了四个对象，固定
    //1. 将构造器私有化，目的防止 其他人直接new
    //2. 去掉setXXX方法，防止属性被修改
    //3. 在Season内部，直接创建固定的对象
    //4. 优化，加入final修饰符
    public static final Season SPRING = new Season ("春天","温暖");
    public static final Season WINTER = new Season ("冬天","寒冷");
    public static final Season AUTUMN = new Season ("秋天","凉爽");
    public static final Season SUMMER = new Season ("夏天","炎热");

    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
