package Java30days_韩顺平.Chapter8.Homeworks.Homework08;

public class BankAccount {
    private double balance;//余额
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    //存款
    public void deposit(double amount){
        balance+=amount;

    }
    //取款
    public void withdraw (double amount){
        balance-=amount;

    }
}
