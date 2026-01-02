package Day8_29122025;
// Overloading main method
public class Overload_main {
    public static void main(String[] args) {
        System.out.println("Main method  with string[] arguments : "+args);
        main(10);
        main(11.23);
    }

    public static void main(int args) {
        System.out.println("Main method with int arguement : "+args);
    }

    public static void main(double args) {
        System.out.println("Main method wiht double arguements :"+args);
    }
}
