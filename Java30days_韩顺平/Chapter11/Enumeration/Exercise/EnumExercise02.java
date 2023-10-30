package Java30days_韩顺平.Chapter11.Enumeration.Exercise;

public class EnumExercise02 {
    public static void main(String[] args) {
        Week weeks [] = Week.values();
        //增强for 循环
        for (Week week : weeks){
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("星期一"),
    Tuesday("星期二"),
    Wesnesday("星期三"),
    THURSDAY("星期四"),
    FRIDAT("星期五"),
    SATURDY("星期六"),
    SUNDAY("星期日");
    private final String chinese;

    private Week(String chinese){
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return "Week{" +
                "chinese='" + chinese + '\'' +
                '}';
    }
}
