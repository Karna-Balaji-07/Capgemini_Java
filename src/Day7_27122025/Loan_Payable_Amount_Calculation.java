package Day7_27122025;
// Loan payable amount calculation
public class Loan_Payable_Amount_Calculation {
    public static double principal = 200000;
    public static int years = 5;
    public static String loan_type = "HOME";

    public static double loan(double principal){
        double amount = principal + (principal*0.08);
        return amount;
    }
    public static double loan(double principal, int years){
        double amount = principal * Math.pow(1.10, years);
        return amount;
    }
    public static double loan(double principal, int years, String loan_type){
        double rate  =0;
        if(loan_type.equals("HOME")) rate = 0.07;
        else if(loan_type.equals("AUTO")) rate = 0.09;
        else if(loan_type.equals("PERSONAL")) rate = 1.12;
        System.out.println("Computed rate : "+(int)(rate*100)+"%");
        double amount = principal * Math.pow(1+rate , years);
        return amount;
    }

    public static void main(String[] args) {
        System.out.println(loan(principal));
        System.out.println(loan(principal,years));
        System.out.println(loan(principal,years,loan_type));




    }

}
