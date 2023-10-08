package Java30days_韩顺平.Chapter7;

public class Factorial {
    public static void main(String[] args){
        Recursion recursion =new Recursion();
        int res = recursion.fac(5);
        System.out.println(res);
    }

    ;
}
class Recursion {
    public int fac(int n){
        if (n==1){
            return 1;
        }else{
            return fac (n-1)*n;
        }
    }
}
/*递归的重要规则
1. 执行一个方法时，就创建一个新的受保护的独立空间（栈空间）
2. 方法局部变量时独立的，不会相互影响，比如n变量
3. 如果方法中使用的是引用类型变量（比如数组，对象），
就会共享该引用类型的数据
4. 递归必须向退出递归条件逼近，否则会出现无限递归（stackoverflow栈溢出）
5. 当一个方法执行完毕，或遇到了return，就会返回。
    遵守谁调用，就将结果返回给谁，
    同时当方法执行完毕或者返回时，该方法执行完毕
 */

