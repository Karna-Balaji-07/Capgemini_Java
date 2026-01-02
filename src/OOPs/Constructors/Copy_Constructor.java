package OOPs.Constructors;

class rectangle{
    int length;
    int width;

    public rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    public rectangle(rectangle obj){
        this.length = obj.length;
        this.width = obj.width;
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        rectangle obj = new rectangle(10,20);
        System.out.println(obj.length);
        System.out.println(obj.width);

        rectangle obj2 = new rectangle(obj);
        System.out.println(obj2.width);
        System.out.println(obj2.length);
    }
}
