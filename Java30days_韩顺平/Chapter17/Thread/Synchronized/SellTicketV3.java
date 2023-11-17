package Java30days_韩顺平.Chapter17.Thread.Synchronized;

public class SellTicketV3 {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        //三个线程访问的是同一个对象，同一个锁
    }
}

class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;

    private /*synchronized*/ void sell() {//同步方法，这时锁在 this对象
        synchronized (this) {
            System.out.println(this.hashCode());
            /*在这个代码片段中，this 关键字指的是当前对象的实例，
            也就是包含这个 sell() 方法的对象实例。
            这段代码似乎是一个用于卖票的方法，
            这个方法应该属于某个类，而在实例化这个类的过程中创建的对象就是 this。
            当你在方法内部使用 synchronized (this) 时，你在同步代码块中锁定了当前对象实例，
            以确保在同一时刻只有一个线程可以进入这个方法并执行其中的代码块。
            这是为了避免多个线程同时访问 sell() 方法，导致竞态条件（race condition）和不一致的结果。
            所以，this 在这里表示的是当前调用 sell() 方法的对象实例，
            而通过 synchronized (this)，你对这个对象实例进行了锁定，以确保线程安全。
            */
            if (ticketNum <= 0) {
                System.out.println("票卖完了！");
                loop = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数=" + (--ticketNum));
        }
    }

    public void run() {
        while (loop) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sell();
        }
    }
}

