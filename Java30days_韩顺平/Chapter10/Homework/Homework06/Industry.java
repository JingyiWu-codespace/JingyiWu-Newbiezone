package Java30days_韩顺平.Chapter10.Homework.Homework06;

public class Industry {
    //船可以每次换，马只能是一匹
    //运用饿汉式
    private static Horse horse = new Horse();
    private Industry(){};
    public static Horse getHouse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Airplane getAirplane(){
        return new Airplane();
    }

}
