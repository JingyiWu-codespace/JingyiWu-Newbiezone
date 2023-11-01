package Java30days_韩顺平.Chapter10.Homework.Homework07;

public class Car {
    private double temperature;
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if (temperature>=40){
                System.out.println("冷风催的人心好冷");
            } else if (temperature<0) {
                System.out.println("空调温暖你的心");
            } else{
                System.out.println("关闭空调");
            }

        }
    }
    public Air getAir(){
        return new Air();
    }
}
