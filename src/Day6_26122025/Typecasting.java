package Day6_26122025;

// Type casting
public class Typecasting {
    public static void main(String[] args) {
        // Primitive Type casting

        // widening : Implicit conversion
        byte b = 10;
        int i = b;
        System.out.println("Conversion from byte to int : "+i);
        long l = i;
        System.out.println("Conversion from int to long : "+l);
        double d = i;
        System.out.println("Conversion from int to double : "+d);

        // Narrowing : Explicit conversion
        long ll = 1034;
        int ii = (int) ll;
        System.out.println("Conversion from long to int : "+ii);
        int il = 125;
        char c = (char)il;
        System.out.println("Conversion from int to char : "+ c);

    }

}
