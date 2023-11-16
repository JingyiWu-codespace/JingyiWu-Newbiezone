package Java30days_韩顺平.Projects.TankGame.Draw;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(), hero.getY(),g,0,0 );
        drawTank(hero.getX()+60, hero.getY(),g,0,1 );


    }
    //写方法画出坦克:
    /**
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角x坐标
     * @param g 坦克的左上角x坐标
     * @param direct 坦克的左上角x坐标
     * @param type 坦克的左上角x坐标
     *
     */
    public void drawTank(int x,int y,Graphics g, int direct, int type){
        //根据不同类型的坦克，设置不同颜色
        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.pink);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.cyan);
                break;
        }
        //根据坦克的方向绘制坦克
        switch(direct){
            case 0 :
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x+30, y,10,60,false);
                g.fill3DRect(x+10, y+10,20,40,false);
                g.fillOval(x+10, y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);

                break;
            default:
        }

    }
}
