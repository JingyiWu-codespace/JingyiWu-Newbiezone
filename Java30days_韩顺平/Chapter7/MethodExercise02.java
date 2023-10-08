package Java30days_韩顺平.Chapter7;

public class MethodExercise02 {
    public static void main (String[] args){
//        int [][]arrayTest ={{2,4,6},{2,8,5}};
//        MyTool myTool = new MyTool();
//        myTool.printTwoDimArray(arrayTest);

        Pperson p = new Pperson();
        p.name = "米兰";
        p.age = 100;
        MyTool myTool = new MyTool();
        Pperson p2 = myTool.copyPerson(p);
        //到此p和p2是Pperson的对象，属性相同，但内存独立
        System.out.println("p2的属性："+p2.age+" "+p2.name);
        //比较一下数否为统一对象，地址不同
        System.out.println(p==p2);
    }
}
class Pperson{
    int age;
    String name;
}
class MyTool {
//    public void printTwoDimArray(int [][]arr){
//        for (int i = 0;i<arr.length;i++){
//            for (int j = 0 ;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }System.out.println();
//        }
//    }
    //克隆对象，属性相同，但是存储空间独立
    public Pperson copyPerson(Pperson p){
        Pperson p2 =new Pperson();
        p2.name = p.name;
        p2.age = p.age;
        return p2;


    }
}