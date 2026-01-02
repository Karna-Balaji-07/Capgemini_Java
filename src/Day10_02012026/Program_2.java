package Day10_02012026;

class Overloading
{
    public static void display(int i)
    {
        System.out.println("Inside static integer method display "+i);
    }
    public static void display(String s)
    {
        System.out.println("Inside static String method dispaly "+s);
    }
    public void display(int i, String s)
    {
        System.out.println("Inside non static string and integer method display : "+i+" "+s);
    }
    public void display()
    {
        System.out.println("Inside empty display method");
    }
}



public class Program_2 {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        Overloading.display(100);
        Overloading.display("Hello world");
        obj.display();
        obj.display(10,"Jin");
    }
}
