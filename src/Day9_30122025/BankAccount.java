package Day9_30122025;

import java.util.Scanner;

public class BankAccount {
    static double interest = 5.0;
    double balance = 1000;

    public static void updateInterestRate(double interestRate)
    {
        interest = interestRate;
    }

    public void deposit(double balanceAdd)
    {
        this.balance += balanceAdd;
    }
    public void withdraw(double amount)
    {
        if(this.balance >= amount) this.balance -= amount;
        else System.out.println("Insufficient funds");
    }
    public void displayInfo()
    {
        System.out.println("Current balance : "+this.balance);
        System.out.println("Interest rate : "+ interest);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new interest rate : ");
        double interest = input.nextDouble();
        updateInterestRate(interest);
        System.out.print("Amount to deposit and withdraw for account 1 : ");
        double add = input.nextDouble();
        double subtract = input.nextDouble();
        acc1.deposit(add);
        acc1.withdraw(subtract);
        System.out.print("Amount to deposit and withdraw for account 2 : ");
        double add2 = input.nextDouble();
        double subtract2 = input.nextDouble();
        acc2.deposit(add2);
        acc2.withdraw(subtract2);
        System.out.println("Account 1 info : ");
        acc1.displayInfo();
        System.out.println("Account 2 info : ");
        acc2.displayInfo();

    }
}
