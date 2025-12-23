package Day4_23122025;

public class Program_2 {
    public static void main(String[] args) {

        // characters from range A to M
        System.out.println("Print characters from the range A to M");
        char i = 'A';
        while(i < 'N'){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // characters from range x to m
        System.out.println("Print characters from the range x to m");
        i='x';
        while(i >= 'm'){
            System.out.print(i+" ");
            i--;
        }
    }
}

