package Java30days_韩顺平.Chapter10.Homework.Homework04;
//好好体会一下
public class Test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);

        cellphone.testWork(new Cal(){
            public double work(double n1,double n2) {
                return n1 + n2;
            }
        },10,8);

    }
}
