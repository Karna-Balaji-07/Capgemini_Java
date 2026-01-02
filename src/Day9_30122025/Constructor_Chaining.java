package Day9_30122025;

public class Constructor_Chaining {

    int id;
    String name ;
    double salary ;

    public Constructor_Chaining()
    {
        this.id = 1001;
        this.name = "Unknown";
        this.salary = 100000;
    }

    public Constructor_Chaining(int id)
    {
        this();
        this.id = id;
    }
    public Constructor_Chaining(String name)
    {
        this();
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor_Chaining obj1 = new Constructor_Chaining(1111);
        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(obj1.salary);

        Constructor_Chaining obj2 = new Constructor_Chaining("John Doe");
        System.out.println(obj2.id);
        System.out.println(obj2.name);
        System.out.println(obj2.salary);




    }

}
