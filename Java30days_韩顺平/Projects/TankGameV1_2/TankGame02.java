package Java30days_韩顺平.Projects.TankGameV1_2;

import javax.swing.*;

public class TankGame02 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
