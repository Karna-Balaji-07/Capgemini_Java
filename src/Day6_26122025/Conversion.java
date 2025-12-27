package Day6_26122025;

public class Conversion {
    public static void main(String[] args) {
        long l = 987654321;
        int i = (int) l;
        short s =(short) i;
        byte b = (byte) s;
        System.out.println("Long value : "+l);
        System.out.println("Integer value : "+i);
        System.out.println("Short value : "+s);
        System.out.println("Byte value : "+b);
    }
}
