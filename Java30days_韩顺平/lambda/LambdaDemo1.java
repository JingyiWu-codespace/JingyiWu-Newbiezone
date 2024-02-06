package Java30days_韩顺平.lambda;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LambdaDemo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的写法");
            }
        }).start();

        new Thread (()->{
            System.out.println("lambda的写法 接口+只有一个run方法");
        }).start();

        //IntBinaryOperator 是个接口并且只有一个抽象方法,注意是抽象方法
        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println("匿名内部类的写法:"+i);

        int i1 = calculateNum((int left, int right) -> {
            return left + right;
        });
        System.out.println("lambda的写法："+i1);

        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value%2==0;
            }
        });
        // lambda函数的写法
        printNum((int n)->{
            return n%2==0;
        });

        //匿名内部类的写法
        Integer i2 = typeCover(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println("匿名内部类："+i2);
        //lambda函数的写法
        Integer i3 = typeCover((String s) -> {
            return Integer.valueOf(s);
        });
        System.out.println("lambada:"+i3);

        foreachArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println("匿名内部类：" + value);
            }
        });
        foreachArr(value->
            System.out.println("lambda:"+value));
    }
    public static  int calculateNum (IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }

    public static void printNum(IntPredicate predicate){
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i :arr){
            if (predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static <R> R typeCover(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }

    public static void foreachArr(IntConsumer consumer){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i :arr){
            consumer.accept(i);
        }
    }
}
