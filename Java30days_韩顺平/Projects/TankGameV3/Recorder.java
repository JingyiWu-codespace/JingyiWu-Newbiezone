package Java30days_韩顺平.Projects.TankGameV3;

import java.io.*;
import java.util.Vector;

/**
 * @author jingyiwu
 */
public class Recorder {
    private static int allEnemyTankNum = 0;
    //定义IO对象，准备写数据到文件中
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    //把记录文件保存在src
    private static String recordFile = "src/myRecord.txt" ;
    //定义Vector,指向MyPanel 对象的 敌人坦克Vector
    private static Vector<Enemy> enemyTanks = null;
    private static Vector<Node> nodes = new Vector<>();

    // 添加一个设置Hero的方法

    //定义一个node的节点
    public static void setEnemyTanks(Vector<Enemy> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }
    //增加一个方法用于读取文件，恢复相关信息
    //该方法在继续上局时启动
    public static String getRecordFile(){
        return recordFile;
    }
    public static Vector<Node> getNodesETRecord(){
        try {
            //提升文件健壮性
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            String line = "";
            while ((line = br.readLine())!=null){
                String [] xyd = line.split(" ");
                Node node = new Node (Integer.parseInt(xyd[0]),
                        Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);//放入nodes Vector
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return nodes;
    }

    //增加一个方法，游戏退出时，我们将allEnemyTankNum保存到recordFile
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile)) ;
            bw.write(Integer.toString(allEnemyTankNum));
            //遍历敌人的vector将isLive = true的坦克坐标存储下来
            //定义一个属性，通过set方法得到敌人的vector
            bw.newLine();
            for(int i = 0;i<enemyTanks.size();i++){
                //取出敌人坦克
                Enemy enemy = enemyTanks.get(i);
                if (enemy.isLive){
                    String record = enemy.getX()+" "+enemy.getY()+" "+enemy.getDirect();
                    bw.write(record+"\r\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }
    //当我放坦克击毁一个敌人坦克,就应该++
    public static void addAllEnemyTankNum(){
        Recorder.allEnemyTankNum++;
    }
}
