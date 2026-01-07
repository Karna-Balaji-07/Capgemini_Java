package OOPs.Abstraction;

abstract class Account{
    long accountNumber;
    Account(long acc){
        this.accountNumber = acc;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    abstract double calculateBalance();
}

class Savingss extends Account
{
    double balance;
    double interestRate;
    public Savingss(long acc,double amount, double rate){
        super(acc);
        this.balance = amount;
        this.interestRate = rate;
    }

    @Override
    double calculateBalance() {
        return balance + (interestRate * balance);
    }
}

class LoanAccount extends Account
{
    double loanAmount;
    double interestRate;

    public LoanAccount(long acc, double amount, double rate){
        super(acc);
        this.loanAmount = amount;
        this.interestRate = rate;
    }

    @Override
    double calculateBalance() {
        return loanAmount + (loanAmount*interestRate);
    }
}

public class Program_3 {
    public static void main(String[] args) {
        Savingss s = new Savingss(1000001, 1000.0, 12);
        LoanAccount l = new LoanAccount(1000001,1000.0,12);
        System.out.println(s.calculateBalance());
        System.out.println(l.calculateBalance());
        System.out.println(s.balance);
        System.out.println(s.interestRate);
        System.out.println(l.loanAmount);
        System.out.println(l.interestRate);
        System.out.println(s.getAccountNumber());
        System.out.println(l.getAccountNumber());
    }
}
