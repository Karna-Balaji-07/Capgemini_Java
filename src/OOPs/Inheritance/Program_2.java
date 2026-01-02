package OOPs.Inheritance;

class shape{
    public int getArea(){
        return 0;
    }
}

class rectange extends shape{
    int l;
    int b;
    public rectange(int l, int b){
        this.l = l;
        this.b = b;
    }
    public int getArea(){
        return l*b;
    }
}


public class Program_2 {
    public static void main(String[] args) {
        shape obj1 = new shape();
        System.out.println(obj1.getArea());
        rectange obj2 = new rectange(157,234);
        System.out.println(obj2.getArea());
    }
}
