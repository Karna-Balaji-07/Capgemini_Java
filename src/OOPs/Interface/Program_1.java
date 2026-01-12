package OOPs.Interface;


import static OOPs.Interface.fill1.method1;

interface Printable{
    void print();
}

interface fill1{
    int a = 10;
    public static void method1(){
        System.out.println("Static interface");
    };
}

abstract  class m1{
    void method(){
        System.out.println(2);
    }
    void methods(){
        System.out.println(1);
    }
    void methoda(){
        System.out.println(33);
    }
    abstract void m2();
}

class L1 extends m1{
    @Override
    void m2() {
        System.out.println("hello worlda");
    }

    @Override
    void method() {
        System.out.println(100);
}
}

class MM implements fill1{
    void method(){
        System.out.println("MEthod");
    }
    void method1(){
        System.out.println("method1");
    }
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
//        Printable laser = new LaserPrinter();
//        ink.print();
//        laser.print();
        MM l = new MM();
        l.method();
        l.method();
        System.out.println(MM.a);
        method1();
        l.method1();
    }
}
