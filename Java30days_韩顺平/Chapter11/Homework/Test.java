package Java30days_韩顺平.Chapter11.Enumeration.Homework;

public class Test {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        //switch的括号中，放入枚举对象；
        //在每个case后，直接协商枚举类中定义的枚举对象即可
        switch (color){
            case YELLOW:
                System.out.println("黄色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                System.out.println("匹配不到。。。");
        }

    }
}
