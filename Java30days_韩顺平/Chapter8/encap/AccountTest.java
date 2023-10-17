package Java30days_韩顺平.Chapter8.encap;

public class AccountTest {
    public static void main (String[] args){
        Account a = new Account();
        a.setName("jack");
        a.setBalance(10.00);
        a.setPassword("123");
        a.info();
//        System.out.println(a.getName());
//        System.out.println(a.getBalance());
//        System.out.println(a.getPassword());

    }
}
//体会JAVA封装性
/*1.account类具有属性：姓名（长度2-3-4位数）、余额（>20）
    密码是6位；如果不满足，给出提示信息，并给出默认值
  2. 通过setXXX 的方式给Account的属性赋值
  3. 通过AccountTest中测试
*/

class Account{
    public String name;
    private double balance;
    private String password;
    //提供两个构造器（1. 无参构造器 2.三个参数的构造器）
    public Account(){

    }
    //通过构造器走数据校验
    public Account(String name,double balance,String password){
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }
    public void setName(String name){
        if (name.length()>1&&name.length()<5){
            this.name = name;
        } else {
            System.out.println("名字输入的长度有误");
            this.name = "小麻薯";
        }
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        if (balance>20){
            this.balance = balance;
        } else {
            System.out.println("余额不足，默认为0");
        }

    }
    public double getBalance(){
        return balance;
    }
    public void setPassword(String password){
        if (password.length()==6){
            this.password = password;
        } else {
            System.out.println("密码位数不对，重置为000000");
            this.password ="000000";
        }

    }
    public String getPassword(){
        return password;
    }
    public void info(){
        System.out.println("name:"+" "+name+" "+"balance:"+" "+balance+" "+"password"+" "+password);
    }
}
