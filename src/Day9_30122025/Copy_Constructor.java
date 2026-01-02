package Day9_30122025;

public class Copy_Constructor {

    int id  ;
    String name;

    public Copy_Constructor(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Copy_Constructor(Copy_Constructor obj)
    {
        this.id = obj.id;
        this.name = obj.name;
    }

    public static void main(String[] args) {
        Copy_Constructor obj1 = new Copy_Constructor(1,"A");
        Copy_Constructor obj2 = new Copy_Constructor(obj1);
        System.out.println(obj2.id);
        System.out.println(obj2.name);
    }
}
