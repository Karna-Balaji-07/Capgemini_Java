package OOPs.Interface;

interface Printable{
    void print();
}

class InkjetPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("Printing using Ink Jet Printer");
    }
}

class LaserPrinter implements Printable{
    @Override
    public void print() {
        System.out.println("Printing using Laser Printer");
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Printable ink = new InkjetPrinter();
        Printable laser = new LaserPrinter();
        ink.print();
        laser.print();
    }
}
