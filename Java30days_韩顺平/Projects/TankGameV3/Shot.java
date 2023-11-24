package Java30days_韩顺平.Projects.TankGameV3;
/*分析如何实现当用户按下J键，我方坦克发射一颗子弹
1. 当发射一颗子弹后，就相当于启动一个线程
2. Hero有子弹的对象，当按下J时，我们就启动一个发射行为（线程）
让子弹不停的移动，形成设计的效果
3. MyPanel需要不停的重绘子弹，才能出现该效果
4. 当子弹移动到面板边界时，就应该销毁（把启动的子弹线程销毁）
*/
public class Shot implements Runnable{
    public int x; //子弹x坐标
    public int y; //子弹y坐标
    public int direct = 0; //子弹方向
    public int speed = 10; //子弹速度
    public boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while(true){
            //休眠50秒，让我们能看到子弹运动的轨迹
            try {
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            switch (direct){
                case 0 ://向上
                    y-=speed;
                    break;
                case 1 ://向右
                    x+=speed;
                    break;
                case 2://向下
                    y+=speed;
                    break;
                case 3://向左
                    x-=speed;
                    break;
            }
            System.out.println("子弹 x ="+x+"y="+y);
            //当子弹移动到面板边界时，就应该销毁（把启动的子弹线程销毁）
            //当子弹碰到敌人坦克时，也应该结束线程
            if (!(x>=0&&x<=1000&&y>=0&&y<=750&&isLive)){
                System.out.println("子弹线程结束");
                isLive = false;
                break;
            }
        }

    }
}
