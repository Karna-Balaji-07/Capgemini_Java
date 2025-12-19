package Day1_18122025;

public class Program_2 {
    public static void main(String[] args) {
        // Program to swap without using third variable
        int aa = 22;
        int bb  = 11;
        System.out.println("Before Swapping : "+aa+" <=> "+bb);

        aa = aa ^ bb;
        bb= aa ^ bb;
        aa = aa ^ bb;
        System.out.println("After Swapping : "+aa+" <=> "+bb);

    }
}
