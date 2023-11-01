package Java30days_韩顺平.Chapter12.Exception;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try{
            int res = num1 / num2;
        } catch (Exception e){ // 用大括号包住
            e.printStackTrace();//就是输出红色字的那一部分
            System.out.println(e.getMessage()); //只输出异常的信息
        }
        System.out.println("程序继续运行");
    }
}
