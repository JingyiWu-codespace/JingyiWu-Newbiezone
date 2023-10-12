package Java30days_韩顺平.Chapter7;

public class Maze {
    public static void main(String[] args){
        int [][] map = new int [8][7];
        //1.先创建迷宫，用二维数组表示 7行8列
        //2. 先规定 map 数组的元素：0 表示无障碍路 1 表示有障碍物
        //3. 将最上面的最上面和最下面的一行 全部设置为1

        for (int i =0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //4.将最右边和最左边一列，全部设置为1
        for (int i=0; i < 8; i++){
                map[i][0]=1;
                map[i][6]=1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

//        T test = new T();
//        test.findway(map,1,1);
        //输出当前地图：
        System.out.println("=====当前情况======");
        for (int i = 0;i<map.length;i++){
            for (int j = 0 ;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }System.out.println("");
        }

        T test2 = new T();
        test2.findway2(map,1,1);
        System.out.println("=====找到路的情况======");
        for (int i = 0;i<map.length;i++){
            for (int j = 0 ;j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }System.out.println("");
        }


    }
}
class T {
    //使用递归回溯的思想来解决老鼠出迷宫
    //老韩解读
    //1. findway方法就是专门来找出迷宫的路径
    //2. 如果找到，就返回true，否则就返回false
    //3. map就是二维数组，表示迷宫 i和j表示当前初始化的位置
    //4. 初始化的位置是1，1
    //5. 因为我们是递归找路，所以我先规定map数组的各个值的含义
    //6. 0 表示没走过可以走 1 表示障碍物 2. 表示可以走 3.表示走过，但是走不通
    //7. 当map(6,5)==2 时，说明找到了通路，可以结束findway()方法，否则继续找
    //8. 先确定找路的策略 下——>右->上——>左
//    public boolean findway(int[][]map,int i, int j){
//        if (map[6][5]==2){
//            return true;
//        } else {
//            if (map[i][j]==0) {//当前这个位置为0，说明还没走，但是可以走
//                //我们假定可以走通
//                map[i][j] = 2;
//                //使用找路策略，来确定该位置是否真的可以走通
//                //下->右—>上——>左
//                if (findway(map, i + 1, j)) {
//                    return true;//先尝试走下
//                } else if (findway(map, i, j + 1)) {
//                    return true; //向右
//                } else if (findway(map,i - 1, j)) {
//                    return true; //向上
//                } else if (findway(map, i, j - 1)) {
//                    return true; //向左
//                } else {
//                    map[i][j] = 3;
//                    return false;
//                }
//
//                //使用找路策略，来定位该位置是否可以走通
//            } else { // map[i][j] =1,2,3
//                return false;
//            }
//
//        }
//    }
    //上——>右——>下——>左
    public boolean findway2 (int[][]map,int i, int j){
        if (map[6][5]==2){
            return true;
        } else {
            if (map[i][j]==0) {//当前这个位置为0，说明还没走，但是可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //上——>右——>下——>左
                if (findway2(map, i-1 , j)) {
                    return true;//先尝试走上
                } else if (findway2(map, i, j+1)) {
                    return true; //向右
                } else if (findway2(map, i+1 , j)) {
                    return true; //向下
                } else if (findway2(map, i, j-1)) {
                    return true; //向左
                } else {
                    map[i][j] = 3;
                    return false;
                }

                //使用找路策略，来定位该位置是否可以走通
            } else { // map[i][j] =1,2,3
                return false;
            }

        }
    }

}





