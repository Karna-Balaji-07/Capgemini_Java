package Day1_18122025;

public class Program_1 {
    public static void main(String[] args) {
        // Program to swap two numbers with a variable
        // Program to swap Two Numbers
        int a = 10;
        int b = 5;
        System.out.println("Before Swapping : "+a+" <=> "+b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping : "+a+" <=> "+b);
    }
}
