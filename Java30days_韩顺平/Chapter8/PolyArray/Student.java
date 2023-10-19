package Java30days_韩顺平.Chapter8.PolyArray;

public class Student extends Person{
    private double score;
    public Student (String name, int age,double score){
        super(name,age);
        this.score = score;
    }
    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return score;
    }
    public String say(){
        return super.say()+"\t"+"分数"+score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }
}
