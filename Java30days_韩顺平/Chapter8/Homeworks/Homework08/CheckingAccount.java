package Java30days_韩顺平.Chapter8.Homeworks.Homework08;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount){
        super.deposit(amount-1);
        //使用了父类的deposit方法
    }
    public void withdraw(double amount){
        super.withdraw(amount+1);
    }

}
