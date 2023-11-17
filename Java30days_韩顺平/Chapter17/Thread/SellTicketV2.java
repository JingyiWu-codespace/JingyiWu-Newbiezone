package Java30days_韩顺平.Chapter17.Thread;

public class SellTicketV2 {
    public static void main(String[] args) {
        SellTicket2 sellTicket2 = new SellTicket2();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();

    }
}
class SellTicket2 implements Runnable{
    private int ticketNum=100;
    public void run(){
        while (true){
            if (ticketNum<=0){
                break;
            }
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数=" + (--ticketNum));
        }
    }
}