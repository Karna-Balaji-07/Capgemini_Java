package Day4_23122025;

public class Program_10 {
    public static void main(String[] args) {
        // Sum and product of all numbers from range 1 to 10

        int sum = 0;
        int prod= 1;
        for (int i = 1; i < 11; i++) {
            sum += i;
            prod *= i;
        }
        System.out.println("Sum of all numbers from 1 to 10 : "+sum);
        System.out.println("Product of all numbers from 1 to 10 : "+prod    );
    }
}
