package Java30days_韩顺平.Chapter10.Homework.Homework02;

public class Frock {
    private static int currentNum = 100000;
    public static int getNestNum(){
         return currentNum+=100;
    }
    private int serialNumber;
    public int getSerialNumber(){
        return serialNumber;
    }
    public Frock(){
        this.serialNumber = getNestNum();
    }

    @Override
    public String toString() {
        return "Frock{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}
