package OOPs;

abstract class book1
{
    book1(){
        System.out.println("Inside Book1 constructor");
    }
    void show(){
        System.out.println("Inside abstract class using non abstract method");
    }
    abstract void show1();
}

class class1 extends book1{
    void show1(){
        System.out.println("Inside class1 where abstract method is used");
        int s = 10;
        System.out.println(s);
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        book1 obj = new class1();
        obj.show1();
        obj.show();
    }
}
