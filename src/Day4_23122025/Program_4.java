package Day4_23122025;

public class Program_4 {
    public static void main(String[] args) {

        // Print characters from range s to l
        System.out.println("Print characters from range s to l");
        char c = 's';
        do{
            System.out.print(c+" ");
            c--;
        } while (c >'k');
        System.out.println();

        // Print characters from range T to Z
        System.out.println("Print characters from range T to Z");
        c = 'T';
        do{
            System.out.print(c+" ");
            c++;
        } while (c <='Z');
        System.out.println();


    }
}
