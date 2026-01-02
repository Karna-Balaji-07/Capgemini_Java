package Day9_30122025;

public class constructor {

    static int v1;
    String s1;

    // static block
    static
    {
        System.out.println("static");
    }
    // non static block
    {
        System.out.println("NOn static block");
    }
    // constructor
    public constructor(int a, String s)
    {
        v1 = a;
        this.s1 = s;
        System.out.println("This is  constructor");
    }
    public void sol()
    {
        System.out.println("Value : " +v1);
        System.out.println("String : "+s1);
    }

    public static void main(String[] args) {

        System.out.println("Main");
        new constructor(10,"hello world").sol();
    }
}
