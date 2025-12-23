package Day4_23122025;

public class Program_3 {
    public static void main(String[] args) {

        // print numbers from the range -111 to -101
        System.out.println("Print numbers from the range -111 to -101");
        int i = -111;
        do{
            System.out.print(i+" ");
            i++;
        } while (i < -100);
        System.out.println();

        // print numbers from the range 123 to 113
        System.out.println("Print numbers from the range 123 to 113");
        i = 123;
        do{
            System.out.print(i+" ");
            i--;
        } while (i > 112);
        System.out.println();

        // print numbers from the range 5 to -5
        System.out.println("Print numbers from the range 5 to -5");
        i = 5;
        do{
            System.out.print(i+" ");
            i--;
        } while (i >-6);
        System.out.println();

        // print numbers from the range -10 to 0
        System.out.println("Print numbers from the range -10 to 0");
        i = -10;
        do{
            System.out.print(i+" ");
            i++;
        } while (i < 1);
    }
}
