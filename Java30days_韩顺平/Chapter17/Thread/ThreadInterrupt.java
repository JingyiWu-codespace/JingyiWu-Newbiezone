package Java30days_韩顺平.Chapter17.Thread;

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("小吴");
        t.start();
        for(int i=0;i<5;i++){
            Thread.sleep(1000);
            System.out.println("main休息"+i);
        }
        t.interrupt();
    }
}
class T extends Thread{

    @Override
    public void run() {
        while(true){
            for(int i = 0;i<100;i++){
                System.out.println("吃包子 "+i);
            }
            try{
                System.out.println("休眠中……");
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName()+"被中断");
            }

        }
    }
}