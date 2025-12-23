package Day4_23122025;


public class Program_18 {
    public static void main(String[] args) {
        // factorial of all numbers from range 1 to 10
        int fact = 1;
        for (int i = 1; i < 11; i++) {
            fact *= i;
            System.out.println("Factorial of "+i+" is "+ fact);
        }
    }
}
