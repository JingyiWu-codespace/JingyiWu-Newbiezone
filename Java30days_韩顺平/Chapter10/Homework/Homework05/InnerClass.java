package Java30days_韩顺平.Chapter10.Homework.Homework05;

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }

}
class A{
    private String name = "hello";
    //局部内部类定义在方法和代码块里
    public void f1(){
        class B{
            private final String  name = "小红";
            public void show(){
                System.out.println("Name:"+name);
                System.out.println("Name:"+A.this.name);
                //重名时 访问外部类A.this.name
            }
        }
        B b= new B ();
        b.show();
    }
}