package Java30days_韩顺平.Chapter17.Thread;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        Thread subThread = new Thread(t3);


        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            if (i == 5) {
                subThread.start();
                subThread.join();
                System.out.println("子线程结束");
            }
            Thread.sleep(1000);

        }
        System.out.println("主线程结束");

    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello" + i);
        }
    }
}
