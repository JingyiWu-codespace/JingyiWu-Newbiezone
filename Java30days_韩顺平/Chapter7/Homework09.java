package Java30days_韩顺平.Chapter1to6;

public class Homework09 {
    public static void main(String[] args){
        Music m1 = new Music("请给我一首歌的时间",5);
        m1.play();
        System.out.println(m1.info());

    }

}
class Music{
    String name;
    int times;
    public Music(String name, int times){
        this.name = name;
        this.times= times;
    }
    public void play(){
        System.out.println("播放音乐ing"+" "+this.name);
    }
    public String info(){
        return this.name+" "+this.times+"分钟";
    }
}
