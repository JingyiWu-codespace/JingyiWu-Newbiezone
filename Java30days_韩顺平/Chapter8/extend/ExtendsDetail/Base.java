package Java30days_韩顺平.Chapter8.extend.ExtendsDetail;

public class Base {
    public int n1 = 300;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public Base(){//无参构造器
        System.out.println("Base()");
    }
    public void test100(){
        System.out.println("test100");
    }
    public void test200(){
        System.out.println("test200");
    }
    void test300(){};
    private void test400(){};
}
