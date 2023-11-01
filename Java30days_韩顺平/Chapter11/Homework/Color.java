package Java30days_韩顺平.Chapter11.Enumeration.Homework;

public enum Color implements IShow{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;
    Color(int redValue, int greenValue, int blueValue){
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为："+redValue);
        System.out.println("属性值为："+greenValue);
        System.out.println("属性值为："+blueValue);
    }
}
