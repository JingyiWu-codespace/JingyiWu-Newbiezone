package Java30days_韩顺平.Chapter12.Homework;

public class ProgramResult {
    public static void func() {
        try{
            throw new RuntimeException();
        }
        finally {
            System.out.println("B");
        }

    }

    public static void main(String[] args) {
        try{
            func();
            System.out.println("A");
        }
        catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }
}

