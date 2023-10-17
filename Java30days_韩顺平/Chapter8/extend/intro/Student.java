package Java30days_韩顺平.Chapter8.extend.intro;
// 父类，是Pupil和Graduate的父类
public class Student {
    public String name;
    public int age;
    private double score;
    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return this.score;
    }
    public void info(){
        System.out.println(name+"\t"+age+"\t"+score);
    }
}
