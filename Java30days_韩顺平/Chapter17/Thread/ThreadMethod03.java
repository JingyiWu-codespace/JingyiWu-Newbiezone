package Java30days_韩顺平.Chapter17.Thread;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        Daemon d = new Daemon();
        d.setDaemon(true);
        d.start();
        for(int i = 0 ;i<=10;i++){
            Thread.sleep(1000);
            System.out.println("宝强努力工作！");

        }
    }

}
class Daemon extends Thread{
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("马蓉和宋喆快乐的聊天，哈哈哈～～～～");
        }
    }
}