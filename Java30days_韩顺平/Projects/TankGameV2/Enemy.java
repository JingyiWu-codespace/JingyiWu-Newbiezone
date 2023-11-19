package Java30days_韩顺平.Projects.TankGameV2;

import java.util.Vector;

/*
敌人的坦克也能发射子弹（可以有多颗子弹）
1. 在敌人坦克类，使用Vector保存多个Shot
2. 当每创建一个敌人坦克对象，应该给敌人对象初始化一个Shot对象，同时启动Shot
3. 绘制坦克时，需要遍历敌人的坦克对象Vector绘制所有子弹
    当子弹isLive=false就从vector移除
 */
public class Enemy extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public Enemy(int x, int y) {
        super(x, y);
    }
    @Override
    public void run() {
        //保证敌人坦克只有一颗子弹
        while (true) {
            if (isLive && shots.size()<1){
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()){
                    case 0:
                        s = new Shot(getX()+20,getY(),0);
                        break;
                    case 1:
                        s = new Shot(getX()+60,getY()+20,1);
                        break;
                    case 2:
                        s = new Shot(getX()+20,getY()+60,2);
                        break;
                    case 3:
                        s = new Shot(getX(),getY()+20,3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            //根据坦克的方向继续移动
            switch (getDirect()) {
                case 0://向上
                    for (int i = 0; i < 20; i++) {
                        if(getY()>0){
                            this.moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 1://向右
                    for (int i = 0; i < 20; i++) {
                        if(getX()+60<1000){
                            this.moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();;
                        }
                    }
                    break;
                case 2://向下
                    for (int i = 0; i < 20; i++) {
                        if(getY()+60<750){
                            this.moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();;
                        }
                    }
                    break;
                case 3://向左
                    for (int i = 0; i < 20; i++) {
                        if(getX()>0){
                            this.moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();;
                        }
                    }
                    break;
            }
            //休眠50毫秒，避免随机乱串的现象
            //随机改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //写并发程序，一定考虑 线程什么时候结束
            if (!isLive) {
                break; //被击中退出线程
            }
        }
    }
}