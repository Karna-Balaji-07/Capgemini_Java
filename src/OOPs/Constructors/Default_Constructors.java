package OOPs.Constructors;

class cat{
    int age;
    String name;

    public cat(){
        this.age = 0;
        this.name = "UNKNOWN";
    }
}


public class Default_Constructors {
    public static void main(String[] args) {
        cat obj = new cat();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
