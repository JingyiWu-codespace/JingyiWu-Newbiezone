package Java30days_韩顺平.Projects.TankGameV1_2;

public class Enemy extends Tank {
    private int x;
    private int y;
    public Enemy(int x,int y){
        super(x,y);
        this.setX(x);
        this.setY(y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}