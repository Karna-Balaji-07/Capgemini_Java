package Day10_02012026;

class Laptop
{
    int ramSize;
    String brand;
    double price;

    public Laptop()
    {
        this.ramSize = 8;
        this.brand = "UNKNOWN";
        this.price = 50000;
    }
    public Laptop(String brand)
    {
        this();
        this.brand = brand;
    }
    public Laptop(String brand, int ram){
        this(brand);
        this.ramSize = ram;
    }
    public Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ramSize = ram;
        this.price = price;
    }
    public void printdetails(){
        System.out.println("Laptop brand : "+brand);
        System.out.println("Laptop price : "+price);
        System.out.println("Laptop ram size : "+ramSize);
    }
}



public class Program_1 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.printdetails();
        Laptop obj2 = new Laptop("Lenoveo");
        obj2.printdetails();
        Laptop obj3 = new Laptop("HP",16);
        obj3.printdetails();
        Laptop obj4 = new Laptop("DELL",16,75000);
        obj4.printdetails();
    }
}
