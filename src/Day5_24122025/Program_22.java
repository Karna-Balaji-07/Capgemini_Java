package Day5_24122025;
/*
75. Write a Java program that uses only parameterized methods (no logic in main) to analyze a given number.
	You must implement the following parameterized methods:

	Required Methods
	1.	int reverseNumber(int num)
	→ Returns the reverse of the number.

	2.	boolean isPalindrome(int num, int reversed)
	→ Returns true if the number is a palindrome.

	3.	boolean isStrongNumber(int num)
	→ Returns true if the number is a Strong Number

	4.	int countPrimeDigits(int num)
	→ Counts how many digits in the number are prime digits.

	5.	void numberReport(int num)
	→ Calls all the above methods and prints:
	•	Reverse of the number
	•	Whether it is Palindrome
	•	Whether it is Strong Number
	•	Count of prime digits
 */
public class Program_22 {

    public static int reverseNumber(int n){
        int rev = 0;
        while(n != 0){
            rev = rev*10 + (n%10);
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num, int rev){
        return num==rev;
    }

    public static int countPrimeDigits(int n) {
        int count = 0;
        int m = n;

        while (m != 0) {
            int r = m % 10;

            if (r > 1) {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(r); i++) {
                    if (r % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count++;
            }

            m /= 10; // always executed
        }
        return count;
    }


    public static boolean isStrongNumber(int n){
        int sum = 0;
        int m = n;
        while(n > 0){
            int r = n % 10;
            int fact= 1;
            for (int i = 1; i <= r; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }
        return sum==m;
    }

    public static void numberReport(int n){
        System.out.println(reverseNumber(n));
        System.out.println(isPalindrome(n,reverseNumber(n)));
        System.out.println(countPrimeDigits(n));
        System.out.println(isStrongNumber(n));

    }

    public static void main(String[] args) {
        numberReport(100);
        numberReport(12);
        numberReport(1);
    }

}
