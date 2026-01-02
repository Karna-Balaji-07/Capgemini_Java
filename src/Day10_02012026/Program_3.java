package Day10_02012026;

class DemoClass
{
    static
    {
        System.out.println("Static block 1");
    }
    static
    {
        System.out.println("Static block 2");
    }
    {
        System.out.println("Non static block ");
    }
    public void displayMessage()
    {
        System.out.println("Non static method ");
    }
    public static void staticMethodOne()
    {
        System.out.println("Static method 1");
    }
    public static void staticMethodTwo()
    {
        System.out.println("Static method 2");
    }
}


public class Program_3 {
    public static void main(String[] args) {
        DemoClass.staticMethodOne();
        DemoClass.staticMethodTwo();
        DemoClass obj = new DemoClass();
        obj.displayMessage();
    }

}
