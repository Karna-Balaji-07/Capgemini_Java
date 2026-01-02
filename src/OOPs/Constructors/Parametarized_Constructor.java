package OOPs.Constructors;

class Dog{
    String name;
    String color;

    public Dog(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
}

public class Parametarized_Constructor {
    public static void main(String[] args) {
        Dog obj = new Dog("Kevin","Black");
        System.out.println(obj.name);
        System.out.println(obj.color);
    }
}
