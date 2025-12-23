package Day4_23122025;

public class Program_6 {
    public static void main(String[] args) {

        // Print characters from range [d,j]
        System.out.println("Print characters from the range [d,j]");
        for (char i = 'd'; i < 'k'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Print characters from range [n,e]
        System.out.println("Print characters from the range [n,e]");
        for (char i = 'n'; i > 'd'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Print characters from range [z,t]
        System.out.println("Print characters from the range [z,t]");
        for (char i = 'z'; i > 's'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
