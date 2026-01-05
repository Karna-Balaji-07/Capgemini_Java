package OOPs.Inheritance;
// SIMPLE INHERITANCE : BANK ACCOUNT SYSTEM

class BankAccounts
{
    protected int accountNumber;
    protected double balance;

    public BankAccounts(int acc, double amount){
        this.accountNumber = acc;
        this.balance = amount;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount depostied");
    }
    public void withdraw(double amount){
        if(amount >0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn");

        }
    }
    public double getBalance(){
        return this.balance;
    }

}

class SavingsAccounts extends BankAccounts
{
    private double interestRate;
    public SavingsAccounts(int acc, double bal, double rate){
        super(acc,bal);
        this.interestRate = rate;
    }
    public void addInterest(){
        double interest = balance * interestRate/ 100;
        balance += interest;
    }
    public double getInterestRate(){
        return interestRate;
    }
}

public class Program_6
{
    public static void main(String[] args) {
        SavingsAccounts savings = new SavingsAccounts(1001,25000.0, 12);
        System.out.println("Interest Rate : "+ savings.getInterestRate());
        savings.deposit(10000);
        savings.withdraw(22000);
        System.out.println("Balance amount : "+ savings.balance);
        System.out.println("Balance amount : "+ savings.getBalance());
    }
}
