package Java30days_韩顺平.Chapter8.extend.ExtendsExercises;

class A {
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("A.name");
    }
}
class B extends A{
    B(){
        this("abc");
        // this与super冲突
        // this("abc") 这样的语句，
        // 它表示在调用无参构造函数 B() 时，
        // 会首先调用带参数的构造函数 B(String name)，
        // 并且传递字符串 "abc" 作为参数。
        // 所以他调用 B(String name)的构造器
        // 最后在执行完B()构造器的剩余方法
        System.out.println("b");
    }
    B(String name){
            System.out.println("b.name");
        }
    }

