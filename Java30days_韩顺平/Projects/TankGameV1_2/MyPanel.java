package Java30days_韩顺平.Projects.TankGameV1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了监听键盘事件，使用keylistenner接口，处理wsda健按下的情况
public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    Vector <Enemy> enemies = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel(){
        hero = new Hero(100,100);
        for (int i = 0;i<enemyTankSize;i++){
            Enemy enemyTank = new Enemy((100*(i+1)),0);
            enemyTank.setDirect(2);
            enemies.add(enemyTank);
        }

    }
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,1000,750);
        drawTank(hero.getX(), hero.getY(),g, hero.getDirect(), 0 );
        for (int i = 0;i<enemies.size();i++){
            Enemy enemyTank = enemies.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }

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
        //direct 表示方向(0-向上，1-向右，2-向下，3-向左)
        switch(direct){
            case 0 ://向上
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x+30, y,10,60,false);
                g.fill3DRect(x+10, y+10,20,40,false);
                g.fillOval(x+10, y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1:
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y+30,60,10,false);
                g.fill3DRect(x+10, y+10,40,20,false);
                g.fillOval(x+20, y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x, y,10,60,false);
                g.fill3DRect(x+30, y,10,60,false);
                g.fill3DRect(x+10, y+10,20,40,false);
                g.fillOval(x+10, y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x, y,60,10,false);
                g.fill3DRect(x, y+30,60,10,false);
                g.fill3DRect(x+10, y+10,40,20,false);
                g.fillOval(x+20, y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;

            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
