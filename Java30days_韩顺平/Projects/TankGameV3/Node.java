package Java30days_韩顺平.Projects.TankGameV3;
/*
一个Node对象，表示一个敌人坦克的坐标
 */
public class Node {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Node(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
