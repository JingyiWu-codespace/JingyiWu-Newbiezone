package Java30days_韩顺平.Chapter7;
//编写类A01，定义方法max,实现求某个double数组的最大值，并返回
public class Homework01 {
    public static void main (String[] args){
        //double[]doubles = new double[10];
        //doubles = new double[]{3, 4, 5, 2, 4, 5, 7, 27};
        double[] doubles = {};
        //两种不同创建数组的方式
        A01 t1 = new A01(doubles);
        //首字母大写的D指的是包装类，里面有null
        Double res = t1.max(doubles);
        if (res != null){
            System.out.println(t1.max(doubles));
        }else {System.out.println(t1.max(doubles)+"十足不能为空且输入有误");}


    }
}
class A01{
    double[]list;
    public A01(double[]list){
        this.list =list;
    }
    public Double max(double list[]){
        //要保证传入的列表是正确的，考虑代码健壮性
        if (list!=null&&list.length>0){
            double maxNum = list[0];//假定第一个元素是最大值
            for (int i=0;i<list.length;i++){
                if (list[i]>maxNum){
                    maxNum = list[i];
                }
            }return maxNum;
        }else {
            return null;
        }
    }
}
