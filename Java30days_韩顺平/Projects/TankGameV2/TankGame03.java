package Java30days_韩顺平.Projects.TankGameV2;

import javax.swing.*;

public class TankGame03 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame03 tankGame03 = new TankGame03();
    }

    public TankGame03() {
        mp = new MyPanel();
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
