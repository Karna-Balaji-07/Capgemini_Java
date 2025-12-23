package Basic_Programs;

import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        // check whether the given values hold in each integer datatypes
        // order is byte > short > int > long

        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int i = 0; i < test; i++) {
            try {
                long n = input.nextLong();
                if ((n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) || (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) ||
                        (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) || (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE)) {
                    System.out.println(n + " can be fitted in: ");
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) System.out.println("* byte");
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) System.out.println("* short");
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) System.out.println("* int");
                    if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE) System.out.println("* long");

                }
            } catch (Exception e) {
                System.out.println(input.next() + " can't be fitted anywhere");
            }
        }
    }
}
