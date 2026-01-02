package OOPs.StaticMembers;

class Initializer
{
    static int initialValue;
    static{
        initialValue = 1000;
    }

}

public class Static_Block {
    public static void main(String[] args) {
        System.out.println(Initializer.initialValue);
        Initializer obj = new Initializer();
        System.out.println(Initializer.initialValue);
    }
}
