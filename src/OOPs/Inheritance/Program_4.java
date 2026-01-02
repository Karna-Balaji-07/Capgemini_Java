package OOPs.Inheritance;

class BankAccount{
    int balance;
    public BankAccount(int bal){
        this.balance = bal;
    }
    public void deposit(int bal){
        balance += bal;
    }
    public void withdraw(int bal){
        balance -= bal;
    }
}

class SavingsAccount extends  BankAccount{
    public SavingsAccount(int balance){
        super(balance);
    }
    public void withdraw(int bal){
        if(balance <= 100) return;
        else balance -= bal;
    }
}


public class Program_4
{
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(1500);
        int add = 2400;
        int remove = 320;
        obj1.deposit(add);
        obj1.withdraw(remove);
        System.out.println(obj1.balance);

        SavingsAccount obj2 = new SavingsAccount(99);
        obj2.withdraw(1000);
        System.out.println(obj2.balance);

    }
}
