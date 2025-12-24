package Day5_24122025;
// Calculator
public class Program_19 {
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
    public static int subtraction(int a, int b, int c){
        return a-b-c;
    }
    public static int addition2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int d = 12;
        System.out.println(addition(a,b,c));
        System.out.println(subtraction(a,b,c));
        System.out.println(multiply(a,b,c,d));
        System.out.println(addition2(d,b));
    }
}
