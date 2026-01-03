package Day10_02012026;

class Laptop
{
    int ramSize;
    String brand;
    static double price=100;

    public void sol(double prices){
        this.price-=prices;
    }

    public Laptop()
    {
        this.ramSize = 8;
        this.brand = "UNKNOWN";
        this.price = 500;
    }
    public Laptop(int ramSize)
    {
        this();
        this.ramSize= ramSize;
    }
    public Laptop(String brand, int ram){
        this(ram);
        this.brand = brand;
    }
    public Laptop(String brand, int ram, double prices){
        this.brand = brand;
        this.ramSize = ram;
        this.price = prices;
    }
    public void printdetails(){
        System.out.println("Laptop brand : "+this.brand);
        System.out.println("Laptop price : "+this.price);
        System.out.println("Laptop ram size : "+this.ramSize);
    }
}


public class Program_1 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.printdetails();
        Laptop obj2 = new Laptop(10);
        System.out.println(Laptop.price);
        obj2.printdetails();
        Laptop obj3 = new Laptop("HP",16);
        System.out.println(Laptop.price);

        obj3.printdetails();
        Laptop obj4 = new Laptop("DELL",16,75000);
        System.out.println(Laptop.price);
                ;
        obj4.printdetails();
        obj1.sol(100);
        System.out.println(Laptop.price);
    }
}
