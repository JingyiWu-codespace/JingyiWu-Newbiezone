package Java30days_韩顺平.Chapter8.Homeworks.Homework13;

public class Teacher extends Person{
    private int workYear;
    public Teacher(String name,int age,char gender,int workYear){
        super(name,age,gender);
        this.workYear = workYear;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }
    public int getWorkYear(){
        return workYear;
    }

    @Override
    public String play() {
        return super.play() +"象棋";
    }
    public void teach(){
        System.out.println(getName()+"承诺，会 认真 教课");
    }
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(basicInfo());
        System.out.println("工龄："+this.workYear);
        teach();
        System.out.println(play());
        System.out.println("===============");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workYear=" + workYear +
                '}'+
                super.toString();
    }
}
