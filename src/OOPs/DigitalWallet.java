package OOPs;

class Wallet
{
    private double balance;
    private double dailyLimit=6000;
    private double total;

    public Wallet(double initialBalance, double dailyLimit) {
        this.balance = initialBalance;
        this.dailyLimit = dailyLimit;
    }

    public void addMoney(double amount){
        balance += amount;
        System.out.println("Amount "+amount+" added to wallet. Total balance is "+balance);
    }

    public boolean pay(double amount){
        if(balance <amount){
            System.out.println("Insufficient balance");
            return false;
        }
        if(dailyLimit < total+amount){
            System.out.println("Daily Limit exceeded");
            return false;
        }
        balance -= amount;
        total += amount;
        return true;
    }
    public void resetDailySpend() {
        total = 0;
    }

    public double getTotal()
    {
        return total;
    }
    public double getBalance()
    {
        return balance;
    }


}

public class DigitalWallet {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(5000, 8010);

        System.out.println("Initial Balance: " + wallet.getBalance());

        for (int i = 1; i <= 28; i++) {
            boolean success = wallet.pay(264);

            if (!success) {
                System.out.println("Payment failed at transaction " + i);
                break;
            }
        }

        System.out.println("Total spent today: " + wallet.getTotal());
        System.out.println("Balance remaining: " + wallet.getBalance());
    }
}
