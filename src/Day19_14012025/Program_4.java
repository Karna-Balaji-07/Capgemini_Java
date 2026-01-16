package Day19_14012025;

import java.util.*;

interface BankOperations
{
    void deposit(double i);
    void withdraw(double i);
    void checkBalance();
}

abstract class Account{
    private int accountNo;
    private String holderName;
    private double balance;
    Account(int no, String name, double bal){
        this.accountNo = no;
        this.holderName = name;
        this.balance = bal;
    }
    public int getAccountNo(){return accountNo;}
    public String getHolderName(){return holderName;}
    public double getBalance(){return balance;}
    protected void setBalance(double balance) {
    this.balance = balance;
}

}

class Savings extends Account implements BankOperations
{
    Savings(int i, String s, double d){
        super(i,s,d);
        
    }
    public void deposit(double amount){
        setBalance(getBalance()+amount);
    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
    public void checkBalance(){
        System.out.println("Balance: "+ getBalance());
    }
}


public class Program_4 {
    public static void main(String[] args) {
        
        List<Savings> arr = new ArrayList<>();
        Savings s1 = new Savings(1001, "John", 10000);
        Savings s2 = new Savings(1002, "Silva", 8000);
        Savings s3 = new Savings(1003, "Bond", 114);
        Savings s4 = new Savings(1004, "John Doe", 100);
        Savings s5 = new Savings(1005, "Mark", 5000);
        Savings s6 = new Savings(1006, "Vision", 3000);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        arr.add(s6);

        Iterator<Savings> itr = arr.iterator();
        while(itr.hasNext()){
            if(itr.next().getAccountNo() == 1001){
                itr.remove();
                break;
            }
        }
        
        /* Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account*/

    }   
}
