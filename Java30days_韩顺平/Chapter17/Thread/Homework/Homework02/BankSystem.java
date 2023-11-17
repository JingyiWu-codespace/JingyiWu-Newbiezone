package Java30days_韩顺平.Chapter17.Thread.Homework.Homework02;

public class BankSystem {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard();
        new Thread(bankCard).start();
        new Thread(bankCard).start();
    }
}

class BankCard implements Runnable {
    private static double balance = 20000;

    @Override
    public void run() {
        while (true) {
            //解读
            //1. 这里使用synchronized实现了线程同步
            //2. 当多个线程执行到这里，就会争夺this对象锁
            //3. 那个线程争夺到this对象锁，执行sychronized代码块，执行完后，会释放this对象锁
            //4. 争夺不到this对象锁，就阻塞block准备继续争夺
            //5. this对象锁是非公平锁
            synchronized (this) {
                if (balance < 1000) {
                    System.out.println("余额"+balance);
                    break;
                }
                balance -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出了1000块钱");
                System.out.println("余额"+balance);
                //
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
