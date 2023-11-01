package Java30days_韩顺平.Chapter10.Homework.Homework06;

public class Person {
    private String name;
    private Vehicles vehicles;
    //在创建人对象时，事先给他分配交通工具

    public Person(String name,Vehicles vehicles){
        this.name =name;
        this.vehicles = vehicles;
    }
    //实例化Person对象“唐僧”，要求一般情况下用HORSE作为交通工具
    //遇到大河时用Boat作为交通工具
    //这里设计编程思路，把具体要求，封装成方法——>编程思想
    // 思考，如何不浪费，在构建对象时，传入交通工具对象-
    //如果唐僧过火焰山，使用飞机==> 代码的扩展性
    public void passRiver(){
        //判断一下，当前的vehicles，属性是null，获取一艘船
        //如何防止始终传入的是马对象，使用instanceof来替代单纯的==
        if (!(vehicles instanceof Boat)){
            vehicles = Industry.getBoat();
            //向上转型
        }
            vehicles.work();
    }
    public void common(){
        //判断当前的vehicles属性，是否为空，获取一匹马
        //用接口接收
        if (!(vehicles instanceof Horse)){
            //这里使用多态
            vehicles = Industry.getHouse();
        }
        vehicles.work();
    }
    public void passVolcano(){
        if(!(vehicles instanceof Airplane)){
            vehicles = Industry.getAirplane();
        }
        vehicles.work();
    }
}
