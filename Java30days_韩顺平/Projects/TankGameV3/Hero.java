package Java30days_韩顺平.Projects.TankGameV3;

import java.util.Vector;

//自己的坦克
public class Hero extends Tank {
    //定义一个shot对象，表示一个射击（线程）
    Shot shot = null;
    //可以发射多棵子弹
    Vector<Shot>shots = new Vector<>();
    public Hero (int x, int y){
        super(x,y);
    }


    public void shotEnemyTank(){
        //最多只能发射5课子弹
        if (shots.size()>=5){
            return;
        }
        //创建一个射击对象，根据当前hero对象的位置和方向创建shot
        switch (getDirect()){//得到hero的对象方向
            case 0://向上
                shot = new Shot(getX()+20,getY(),0);
                break;
            case 1: //向右
                shot = new Shot(getX()+60,getY()+20,1);
                break;
            case 2: //向下
                shot = new Shot(getX()+20,getY()+60,2);
                break;
            case 3: //向左
                shot = new Shot(getX(),getY()+20,3);
                break;
        }
        //把新创建的shot放入集合中
        shots.add(shot);
        //启动shot线程
        new Thread(shot).start();

    }
}
