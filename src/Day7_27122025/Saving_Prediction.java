package Day7_27122025;
// Savings prediction calculation
public class Saving_Prediction {
    public static int income = 45000;
    public static int expense = 30000;
    public static boolean festive_month = true;

    public static double predict(double income, double expense){
        double base_savings = income- predict(income, expense, festive_month);
        return base_savings;
    }

    public static double predict(double income, double expense, boolean festive){
        expense = expense + 0.2*expense;
        return expense;
    }

    public static void main(String[] args) {
        System.out.println("Festive expenses : "+predict(income,expense, festive_month));
        System.out.println("Savings : "+predict(income, expense));
    }
}
