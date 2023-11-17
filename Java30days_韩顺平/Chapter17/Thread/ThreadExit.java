package Java30days_韩顺平.Chapter17.Thread;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        ThreadNotic threadNotic = new ThreadNotic();
        threadNotic.start();
        Thread.sleep(5000);
        threadNotic.setLoop(false);

    }
}
class ThreadNotic extends Thread{
    int count = 0;
    boolean loop = true;
    @Override

    public void run() {
        while(loop){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("运行中"+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

}
