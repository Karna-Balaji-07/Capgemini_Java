package OOPs.Inheritance;

class Account
{
    int accountNo;
    double balance;

    public Account(int acc, double amount){
        this.accountNo = acc;
        this.balance = amount;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount deposited");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawed");
        }
        else System.out.println("Insufficient balance to withdraw");
    }
    public double getBalance(){
        return balance;
    }
}

class LoanAccount extends Account
{
    double interestRate;
    public LoanAccount(int acc, double amount, double rate){
        super(acc,amount);
        this.interestRate = rate;
    }

    public double calculateInterest()
    {
        return balance * interestRate / 100;
    }
    public void withdraw(double amount){
        System.out.println("Withdrawal is not allowed in Loan account");
    }
}

public class Program_7
{
    public static void main(String[] args) {
        LoanAccount loan = new LoanAccount(1213496, 25000,12);
        double interestRate = loan.calculateInterest();
        System.out.println("Interest amount : "+ interestRate);
        System.out.println("Balance amount : "+ loan.getBalance());
        loan.withdraw(1000);
        Account acc = new Account(1213496,25000);
        acc.deposit(10240);
        acc.withdraw(1000);
        System.out.println("Balance amount : "+ acc.getBalance());
    }
}
