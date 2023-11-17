package Java30days_韩顺平.Chapter17.Thread;
/*
通过继承Thread类创建线程
1. 当一个类继承Thread类，该类就可以当作线程使用
2. 我们会重写run方法，写上自己的业务代码
3. run Thread 类实现了runnable接口的run方法
 */
public class Thread01 {
    public static void main(String[] args) {
        //创建cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();
        //开启猫猫线程——>最终会执行cat的run方法
        // 说明：当main线程启动一个子线程Thread-0,主线程不会阻塞，会继续执行
        //这时，主线程和子线程是交替执行
        //cat.run();
        //如果直接执行run，会导致run编程普通的方法，没有启动猫猫线程
        //会被run方法执行完毕，再向下执行，串行化执行，不是多线程了


    }
}
class Cat extends Thread{
    int times = 0;
    public void run(){
        while(true){
            System.out.println("喵喵，我是小猫咪"+(++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times ==80){break;}
            //当times到80，退出while循环，线程也退出，程序结束
        }
    }
}