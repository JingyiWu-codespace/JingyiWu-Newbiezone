package Java30days_韩顺平.Chapter11.Enumeration.Keywords;

public class IncrementForLoop {
    public static void main(String[] args) {
        // 普通for循环
        int num [] = {1,3,4,5};
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        // 增强for循环
        for (int i:num){
            System.out.println(num[i]);
        }
    }
}
