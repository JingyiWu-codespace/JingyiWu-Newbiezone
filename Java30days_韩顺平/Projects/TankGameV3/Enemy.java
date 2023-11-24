package Java30days_韩顺平.Projects.TankGameV3;

import java.util.Vector;

/*
敌人的坦克也能发射子弹（可以有多颗子弹）
1. 在敌人坦克类，使用Vector保存多个Shot
2. 当每创建一个敌人坦克对象，应该给敌人对象初始化一个Shot对象，同时启动Shot
3. 绘制坦克时，需要遍历敌人的坦克对象Vector绘制所有子弹
    当子弹isLive=false就从vector移除
 */
public class Enemy extends Tank implements Runnable {
    //在敌人坦克类使用Vector保存多个shot
    Vector<Shot> shots = new Vector<>();
    Vector<Enemy> enemyTanks = new Vector<>();
    //增加成员，EnemyTank 可以得到敌人坦克的Vector
    //1. Vector<EnemyTank> enemyTanks = new Vector<>()
    //2. 设置到EnemyTank的成员enemyTanks
    boolean isLive = true;

    public void setEnemyTanks(Vector<Enemy> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //编写方法，判断当前敌人坦克，是否和enemyTanks中的其他坦克发生重叠或碰撞
    public boolean isTouchEnemyTank() {
        //判断当前敌人坦克(this)方向
        switch (this.getDirect()) {
            case 0://上
                //让当前敌人坦克和其他所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector中取出一个敌人坦克
                    Enemy enemyTank = enemyTanks.get(i);
                    //不和自己比较，因为自己与自己比较一定碰撞
                    if (enemyTank != this) {
                        //如果敌人坦克是上/下
                        /*
                        1. 如果敌人坦克是上/下 x的范围[enemyTank.getX(),enemyTank.getX()+40]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+60]
                         */
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 2. 当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 3. 当前坦克 右上角的坐标[this.getX()+40, this.getY()
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是右/左
                        /*
                        1. 如果敌人坦克是右/左 x的范围[enemyTank.getX(),enemyTank.getX()+60]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+40]
                         */
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 左上角坐标 [this.getX(), this.getY()]
                            //当前坦克 右上角坐标 [this.getX()+40, this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1://右
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector中取出一个敌人坦克
                    Enemy enemyTank = enemyTanks.get(i);
                    //不和自己比较，因为自己与自己比较一定碰撞
                    if (enemyTank != this) {
                        //如果敌人坦克是上/下
                        /*
                        1. 如果敌人坦克是上/下 x的范围[enemyTank.getX(),enemyTank.getX()+40]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+60]
                         */
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 2. 当前坦克 右上角的坐标[this.getX()+60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 3. 当前坦克 右下角的坐标[this.getX()+60, this.getY()+40
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是右/左
                        /*
                        1. 如果敌人坦克是右/左 x的范围[enemyTank.getX(),enemyTank.getX()+60]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+40]
                         */
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 右上角坐标 [this.getX()+60, this.getY()]
                            //当前坦克 右下角坐标 [this.getX()+60, this.getY()+40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 2://下
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector中取出一个敌人坦克
                    Enemy enemyTank = enemyTanks.get(i);
                    //不和自己比较，因为自己与自己比较一定碰撞
                    if (enemyTank != this) {
                        //如果敌人坦克是上/下
                        /*
                        1. 如果敌人坦克是上/下 x的范围[enemyTank.getX(),enemyTank.getX()+40]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+60]
                         */
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 2. 当前坦克 左上角的坐标[this.getX()+40, this.getY()+60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 3. 当前坦克 右下角的坐标[this.getX()+40, this.getY()+60
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是右/左
                        /*
                        1. 如果敌人坦克是右/左 x的范围[enemyTank.getX(),enemyTank.getX()+60]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+40]
                         */
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 左下角坐标 [this.getX(), this.getY()+60]
                            //当前坦克 右下角坐标 [this.getX()+40, this.getY()+60]
                            if (this.getX()  >= enemyTank.getX()
                                    && this.getX()  <= enemyTank.getX() + 60
                                    && this.getY() +60>= enemyTank.getY()
                                    && this.getY() +60<= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 3://左
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector中取出一个敌人坦克
                    Enemy enemyTank = enemyTanks.get(i);
                    //不和自己比较，因为自己与自己比较一定碰撞
                    if (enemyTank != this) {
                        //如果敌人坦克是上/下
                        /*
                        1. 如果敌人坦克是上/下 x的范围[enemyTank.getX(),enemyTank.getX()+40]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+60]
                         */
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 2. 当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX()  >= enemyTank.getX()
                                    && this.getX()  <= enemyTank.getX() + 40
                                    && this.getY()  >= enemyTank.getY()
                                    && this.getY()  <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 3. 当前坦克 左下角的坐标[this.getX(), this.getY()+40
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX()  <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌人坦克是右/左
                        /*
                        1. 如果敌人坦克是右/左 x的范围[enemyTank.getX(),enemyTank.getX()+60]
                           如果敌人坦克是上/下 y的范围[enemyTank.getY(),enemyTank.getY()+40]
                         */
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {

                            if (this.getX()  >= enemyTank.getX()
                                    && this.getX()  <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            if (this.getX()  >= enemyTank.getX()
                                    && this.getX()  <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
        }
        return false;
    }

    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        //保证敌人坦克只有一颗子弹
        while (true) {
            if (isLive && shots.size() < 1) {
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            //根据坦克的方向继续移动
            switch (getDirect()) {
                case 0://向上
                    for (int i = 0; i < 20; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
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
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            this.moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            ;
                        }
                    }
                    break;
                case 2://向下
                    for (int i = 0; i < 20; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            this.moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            ;
                        }
                    }
                    break;
                case 3://向左
                    for (int i = 0; i < 20; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            this.moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            ;
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