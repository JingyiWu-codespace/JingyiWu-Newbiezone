package Java30days_韩顺平.Chapter17.Thread;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("小狗汪汪"+(++count)+Thread.currentThread().getName());
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
                break;
            }

        }
        
    }
}