package OOPs.Constructors;

class book{
    String title;
    String author;
    double price;

    public book(){
        System.out.println("Inside default constructor");
        this.title = "UNKNOWN";
        this.author = "UNKNOWN";
        this.price = 1.0;
    }

    public book(String title, String author)
    {
        System.out.println("Inside parametarized constructor with 2 arguements");
        this.title = title;
        this.author = author;
    }

    public book(String title, String author, double price)
    {
        System.out.println("Inside parametarized constructor with 3 arguements");
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        book obj1 = new book();
        System.out.println(obj1.author);
        System.out.println(obj1.title);
        System.out.println(obj1.price);
        book obj2 = new book("Harry Potter","J.K. Rowling");
        System.out.println(obj2.author);
        System.out.println(obj2.title);
        System.out.println(obj2.price);
        book obj3 = new book("Inferno","Dan Brown",1299.99);
        System.out.println(obj3.author);
        System.out.println(obj3.title);
        System.out.println(obj3.price);
    }
}
