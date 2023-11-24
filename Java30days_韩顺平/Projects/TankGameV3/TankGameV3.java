package Java30days_韩顺平.Projects.TankGameV3;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGameV3 extends JFrame {
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TankGameV3 tankGamev3 = new TankGameV3();

    }

    public TankGameV3() {
        System.out.println("请输入选择： 1——新游戏 2——继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1920, 1080);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //在JFrame中增加关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
