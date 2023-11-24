package Java30days_韩顺平.Projects.TankGameV3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

//为了监听键盘事件，使用keylistenner接口，处理wsda健按下的情况
//为了让panel不停的重绘子弹，需要让MyPanel继承一个线程接口
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克，放到vector中
    Vector<Enemy> enemies = new Vector<>();
    //定义一个vector用于存放炸弹
    Vector <Node> nodes = new Vector<>();

    //当子弹击中坦克时，就加入一个Bomb对象加入bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 2;
    //定义三张炸弹的图片，用于显示爆炸的效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel(String key) {
        //先判断记录的文件是否存在
        //如果存在，就正常执行，如果文件不存在，提示，只能开启新游戏， key=1;
        File file = new File(Recorder.getRecordFile());
        if(!file.exists()){
            System.out.println("1. 缓存记录不存在，只能开启新游戏"+"\n");
            key = "1";
        } else {
            nodes = Recorder.getNodesETRecord();
        }
        //将MyPanel的对象的enemyTanks设置给Recorder的enemyTanks
        Recorder.setEnemyTanks(enemies);
        hero = new Hero(100, 600);

        switch (key){
            case "1":
                Recorder.setAllEnemyTankNum(0);
                for (int i = 0; i < enemyTankSize; i++) {
                    //创建一个敌人坦克
                    Enemy enemyTank = new Enemy((100 * (i + 1)), 0);
                    //设置方向
                    enemyTank.setEnemyTanks(enemies);
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程，敌人坦克动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    enemies.add(enemyTank);
                }
                break;
            case "2": //继续上局游戏
                for (int i = 0; i < nodes.size(); i++) {
                    //取出一个node添加至敌人坦克的信息
                    Node node = nodes.get(i);
                    Enemy enemyTank = new Enemy(node.getX(), node.getY());
                    //设置方向
                    enemyTank.setEnemyTanks(enemies);
                    enemyTank.setDirect(node.getZ());
                    //启动敌人坦克线程，敌人坦克动起来
                    new Thread(enemyTank).start();
                    //给该enemyTank加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    enemies.add(enemyTank);
                }
                break;
            default:
                System.out.println("你的输入有误……");

        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb3.png"));

        //这里在播放指定的音乐
        //new AePlayWave("src/111.wav").start();
    }
    //编写方法，显示我方击毁地方坦克信息
    public void showInfo(Graphics g){
        g.setColor(Color.DARK_GRAY);
        Font font = new Font("宋体",Font.BOLD,25);
        g.setFont(font);
        g.drawString("累计击毁敌方坦克",1020,30);
        drawTank(1020,60,g,0,1);
        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(Recorder.getAllEnemyTankNum()),1080,100);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        showInfo(g);
        //画出自己的坦克
        if(hero.isLive&&hero!=null){
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        //画出hero射击的子弹
//        if (hero.shot != null && hero.shot.isLive != false) {
//            g.draw3DRect(hero.shot.x, hero.shot.y, 5, 5, false);
//        }
        //将hero的子弹集合shots，遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive != false) {
                g.draw3DRect(shot.x, shot.y, 5, 5, false);
            }else {hero.shots.remove(shot);}
        }
        //如果bombs集合有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个boomb对象的life值去画出对应的图片
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (bomb.life > 6) {

                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //让这个炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb life为0，就在bombs的向量集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemyTank = enemies.get(i);
            //判断当前坦克是否还存活
            //当敌人坦克存活，才可以画出该坦克
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                //画出enemyTank所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive) {
                        g.fill3DRect(shot.x, shot.y, 5, 5, false);
                    } else enemyTank.shots.remove(shot);
                }
            }
        }

    }
    //写方法画出坦克:

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角x坐标
     * @param g      坦克的左上角x坐标
     * @param direct 坦克的左上角x坐标
     * @param type   坦克的左上角x坐标
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型的坦克，设置不同颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.pink);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.cyan);
                break;
        }
        //根据坦克的方向绘制坦克
        //direct 表示方向(0-向上，1-向右，2-向下，3-向左)
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;

            default:
                System.out.println("暂时没有处理");
        }

    }
    public void hitEnemyTank(){
        //遍历子弹
        for(int j =0;j<hero.shots.size();j++){
            Shot shot = hero.shots.get(j);
            if ((shot != null) && (shot.isLive)) {
                //当我的子弹还活着，遍历敌人所有坦克
                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemyTank = enemies.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }
    public void hitHero(){
        for (int i = 0;i<enemies.size();i++){
            Enemy enemyTank = enemies.get(i);
            for (int j = 0;j<enemyTank.shots.size();j++){
                Shot shot = enemyTank.shots.get(j);
                if (hero.isLive&& shot.isLive){
                    hitTank(shot,hero);
                }
            }
        }
    }

    //编写方法，我方子弹是否打中敌人坦克
    public void hitTank(Shot s, Tank tank) {
        //
        switch (tank.getDirect()) {
            case 0:
            case 2:
                if (s.x > tank.getX() && s.x < tank.getX() + 40
                        && s.y > tank.getY() && s.y < tank.getY() + 60) {
                    s.isLive = false;
                    tank.isLive = false;
                    //创建Bomb对象，加入到bombs的集合中
                    enemies.remove(tank);
                    //当我方击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    //但是传进来的坦克不知道敌方还是我方，所以我们判断一下其运行类型
                    if (tank instanceof Enemy){
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);

                }
                break;
            case 1:
            case 3:
                if (s.x > tank.getX() && s.x < tank.getX() + 60 && s.y > tank.getY() && s.y < tank.getY() + 40) {
                    s.isLive = false;
                    tank.isLive = false;
                    enemies.remove(tank);
                    //当我方击毁一个敌人坦克时，就对数据allEnemyTankNum++
                    //但是传进来的坦克不知道敌方还是我方，所以我们判断一下其运行类型
                    if (tank instanceof Enemy){
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            if(hero.getY()>0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if(hero.getY()+60<750){
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            //发射一颗子弹
//            if(hero.shot==null||!hero.shot.isLive){
//                hero.shotEnemyTank();
//            }
            //发射多棵子弹
            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔100毫秒，重绘区域，刷新绘图区域，子弹就移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            hitEnemyTank();
            if(hero.isLive){
                hitHero();
            }

            this.repaint();
        }
    }
}
