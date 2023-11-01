package Java30days_韩顺平.Chapter12.Exception;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age>=18 && age <=120)){
            throw new AgeExcep("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确！！");
    }

}
class AgeExcep extends RuntimeException{
    public AgeExcep(String message){
        super(message);
    }
}
