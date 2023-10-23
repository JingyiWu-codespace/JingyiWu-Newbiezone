package Java30days_韩顺平.Chapter8.Homeworks.Homework08;

public class Homework08 {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        //统计利息的时候count变成初始值
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());

    }
}
