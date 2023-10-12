package Java30days_韩顺平.Chapter7;

public class HanoiTower {
    public static void main (String[] args){
        Tower hanoi = new Tower();
        hanoi.moving(3,'A','B','C');
    }
}
class Tower {
    //方法：num表示要移动的个数：a,b,c分别表示A塔 B塔 C塔
    public void moving (int num, char a,char b,char c){
        if (num==1){
            System.out.println (a + "->" + c);
        }else {
            //如果有多个盘，可以看成两个，最下面的和上面的左右盘
            //（1）先移动上面所有盘到b，借助c
            moving(num-1,a,c,b);
            // (2)把最下面的这个盘，移动到c
            System.out.println(a+"->"+c);
            // (3)再把b塔的所有盘，移动到c，借助a
            moving(num-1,b,a,c);

        }
    }

}
