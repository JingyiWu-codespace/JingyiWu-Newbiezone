package Java30days_韩顺平.Chapter17.Thread;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        t2.start();

        for(int i = 1;i<=20;i++){
            Thread.sleep(1000);
            System.out.println("主线程"+" " +i);
            if(i==5){
                System.out.println("主线程，让子线程先执行");
                //线程插队 一定成功，调用对方的join方法
                //t2.join();
                //Thread.yield();
                // 调用自己的静态方法，资源丰富时，不一定成功
                System.out.println("主线程继续执行");
            }
        }
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<=20;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("子线程"+Thread.currentThread().getName()+" "+i);
        }
    }
}