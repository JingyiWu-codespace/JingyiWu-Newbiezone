package Java30days_韩顺平.Chapter17.Thread.Homework.Homework01;

import java.util.Scanner;

public class HW01Daemon {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        c.setDaemon(true);
        c.start();
        d.start();
        System.out.println("主线程退出");
    }
}
class C extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println((int)(Math.random()*100)+1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class D extends Thread{
    private Scanner scanner = new Scanner (System.in);

    @Override
    public void run() {
        while(true){
            char key = scanner.next().toUpperCase().charAt(0);
            if (key =='Q'){
                System.out.println("D线程退出");
                break;
            }

        }
    }
}