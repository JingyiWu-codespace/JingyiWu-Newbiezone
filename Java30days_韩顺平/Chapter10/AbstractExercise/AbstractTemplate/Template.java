package Java30days_韩顺平.Chapter10.AbstractExercise.AbstractTemplate;

abstract public class Template {
    public abstract void job();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("该任务执行的时间(毫秒)"+(end-start));
    }

}
