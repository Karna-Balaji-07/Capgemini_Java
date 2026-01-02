package Day9_30122025;
// To execute instance initializer block and execute non static method before the execution of main method

public class program1 {

    {
        System.out.println("this is instance initializer block");
        non_static();
    }

    public void non_static()
    {
        System.out.println("This is non static method");
    }

    static{
        System.out.println("Inside static block");
        program1 p1 = new program1();
        p1.non_static();
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

}
