package Java30days_韩顺平.Chapter1to6;

public class Homework02 {
    public static void main(String[] args){
        String[]strs = {"jacky","lily","lucy"};
        A02 h2 = new A02();
        int index = h2.find("lily",strs);
        if (index!=-1){System.out.println("找到了"+"索引是"+index);}
        else {System.out.println("没有或输入数组有误");}

    }
}
class A02{
    String str;
    public A02(){

    }
    public int find(String findstr,String []strs){
        if (strs!=null&&strs.length>1){
            for(int i = 0;i<strs.length;i++){
                if (findstr.equals(strs[i])){
                    return i;
                }
            }return -1;
        }else return -1;

    }
}