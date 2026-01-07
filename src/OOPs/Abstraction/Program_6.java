package OOPs.Abstraction;

abstract class payment{
    abstract void ProcessPayment(double balance, double amount);
}

class CreditCard extends payment{
    @Override
    void ProcessPayment(double amount, double balance) {
        balance -= amount;
    }
}

class UPIPayment extends payment{
    @Override
    void ProcessPayment(double balance, double amount) {
        balance -= amount;
    }
}

class NetBanking extends payment{
    @Override
    void ProcessPayment(double balance, double amount) {
        balance += amount;
    }
}

public class Program_6 {
    static int balance = 1000;

    public static void main(String[] args) {
        payment debit1 = new CreditCard();
        payment debit2 = new UPIPayment();
        payment credit  = new NetBanking();
        debit1.ProcessPayment(balance, 250);
        debit2.ProcessPayment(balance, 330);
        credit.ProcessPayment(balance,1500);
        System.out.println(balance);
    }
}
