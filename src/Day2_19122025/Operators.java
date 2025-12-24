package Day2_19122025;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic operators
        System.out.println("Arithmetic Operation");
        int a =10,b=20,c=2,d=5,n=12;
        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction : "+ (b-a));
        System.out.println("Multiplication : "+ (b*d));
        System.out.println("Division : "+ (b/d));
        System.out.println("MOdulus : "+ (d % c));

        // Unary Operator
        System.out.println("Unary Operation");
        System.out.println("Pre-increment : "+ (++a));
        System.out.println("Post-increment : "+ (a++));
        System.out.println("Pre-decrement : "+ (--b));
        System.out.println("Post-decrement : "+ (b--));

        // Assignment Operator
        System.out.println("Assignment Operation");
        a += 2;
        b -= 2;
        c *= 2;
        d /= 2;
        n %=2;
        System.out.println("After += "+ (a));
        System.out.println("After -= "+ (b));
        System.out.println("After *= "+ (c));
        System.out.println("After += "+ (d));
        System.out.println("After += "+ (n));

        // Relational Day2_19122025.Operators
        System.out.println("Relational Operation");
        int num1 = 10, num2 = 15, num3 = 12;
        System.out.println(" a > b : "+ (num1 > num2));
        System.out.println(" a < b : "+ (num1 < num2));
        System.out.println(" a >= b : "+ (num3 >= num2));
        System.out.println(" a <= b : "+ (num3 <= num2));
        System.out.println(" a == a : "+ (num2 == num2));
        System.out.println(" a != a : "+ (num2 != num2));

        // Logical Day2_19122025.Operators
        System.out.println("Logical Operation");
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        System.out.println("And Operator && : "+ (b1 && b2));
        System.out.println("And Operator && : "+ (b1 && b3));
        System.out.println("Or Operator || : "+ (b1 && b2));
        System.out.println("And Operator || : "+ (b1 && b3));
        System.out.println("Not Operator ! : "+ (!b1));

        // Bitwise operators
        System.out.println("Bitwise Operation");
        int dd = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : " + (dd & e));
        System.out.println("d | e : " + (dd | e));
        System.out.println("d ^ e : " + (dd ^ e));
        System.out.println("~d : " + (~dd));
        System.out.println("d << 2 : " + (dd << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));

    }
}
