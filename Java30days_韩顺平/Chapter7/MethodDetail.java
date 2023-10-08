package Java30days_韩顺平.Chapter7;

public class MethodDetail {
    public static void main(String[] args){
    /*1. 一个方法最多有一个返回值 [思考：如何返回多个结果——返回一个数组]
      2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
      3. 如果方法要求有 返回类型数据，则方法体中最后的执行语句必须为return值
         而且要求的返回值类型必须和return的值类型一致或兼容。
      4. 如果方法是void，则方法体中可以没有return语句，或者只写return;表示结束方法的执行

     形参注意事项：
     1. 一个方法可以用0个参数，也可以用多个参数，中间用逗号隔开 getSum(int n1, int n2)
     2. 参数类型可以为任意类型，包含数据类型或引用类型，比如printArr(int[][]map)
     3. 调用带参数的方法时，一定对应着参数列表传入想同你类型或兼容类型的参数
     4. 方法定义是的参数称为形式参数；方法调用时的参数称为实际参数，简称实惨
     实参和形参的类型要一致或兼容、个数、顺序必须一致

     方法调用细节说明：
     1. 同一个类中的方法调用：直接调用即可。
     2. 跨类中的方法A类调用B类方法：需要通过对象名调用
     对象名.方法名(参数)
     3. 跨类的方法调用和方法的访问修饰符相关
     */
    AA aa = new AA();
    int [] res = aa.getSumAndSub(3,9);
    System.out.println("和="+res[0]);
    System.out.println("差="+res[1]);
    }
}
class AA{
    public int[] getSumAndSub(int n1, int n2){

        int[] resArr = new int[2];//创建一个数组
        resArr[0] = n1+n2;
        resArr[1] = n1-n2;
        return resArr;
    }

}
