package Java30days_韩顺平.Chapter8.Polyparameter;

public class Worker extends Employee{
    public Worker(String name,double salary ){
        super(name,salary);
    }
    public String work(){
        return getName()+"搬砖ing 摸鱼ing 带薪拉粑粑ing";
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
