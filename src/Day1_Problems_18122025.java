public class Day1_Problems_18122025 {
    public static void main(String[] args) {
        // Program to swap two numbers with a variable
        // Program to swap Two Numbers
        int a = 10;
        int b = 5;
        System.out.println("Before Swapping : "+a+" <=> "+b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping : "+a+" <=> "+b);


// Program to swap without using third variable
                System.out.println("Before Swapping : "+a+" <=> "+b);
        int aa = 22;
        int bb  = 11;
        aa = aa ^ bb;
        bb= aa ^ bb;
        aa = aa ^ bb;
        System.out.println("After Swapping : "+aa+" <=> "+bb);


// Sum and average of three integers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1+num2+num3;
        double avg = (double) sum / 3;
        System.out.println("Sum and Average of Three numbers are : "+sum+" and "+ avg);

// Temperature from celsius to Fahrenheit
        int c = 36;
        double f = (1.8 * c) + 32;
        System.out.println("Celsius to Fahrenheit : "+c+"C is "+f+"F");

// Number is even or odd
        int n = 10;
        if(n%10==0) System.out.println("Even");
        else System.out.println("Odd");

// assign and print primitive datatype values
        byte n1 = 125;
        short n2 = 200;
        int n3 = 43234;
        long n4 = 31238794;
        float n5 = 3.4f;
        double n6 = 3.66;
        boolean n7 = false;
        char ch = 'A';
        System.out.println("Byte : "+n1);
        System.out.println("Short : "+n2);
        System.out.println("Int : "+n3);
        System.out.println("Long : "+n4);
        System.out.println("Float : "+n5);
        System.out.println("Double : "+n6);
        System.out.println("Boolean : "+n7);
        System.out.println("Char : "+ch);
        System.out.println();

    }
}

