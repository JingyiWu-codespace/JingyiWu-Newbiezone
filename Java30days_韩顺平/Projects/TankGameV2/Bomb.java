package Java30days_韩顺平.Projects.TankGameV2;
//炸弹类，形成爆炸的效果💥
public class Bomb {
    int x,y;
    int life = 9; //炸弹的生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //减少生命值
    public void lifeDown(){
        if (life>0){
            life--;
        }else {
            isLive = false;
        }
    }
}
