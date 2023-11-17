package Java30days_韩顺平.Chapter17.Thread.Homework.Homework01;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {

        loop = true;
        while(loop){
            System.out.println((int) (Math.random() * 100) +1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("a线程退出");


    }
}
class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a){
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("请输入你的指令");
            char c = scanner.next().toUpperCase().charAt(0);
            if (c =='Q'){
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }

    }
}