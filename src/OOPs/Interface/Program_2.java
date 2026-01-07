package OOPs.Interface;

interface callable{
    void call();
}
interface browsable{
    void browse();
}

class smartphone implements callable,browsable{
    @Override
    public void call() {
        System.out.println("Calling using smartphone");
    }

    @Override
    public void browse() {
        System.out.println("Browing using internet in smartphone");
    }
}



public class Program_2 {
    public static void main(String[] args) {
        callable obj1 = new smartphone();
        browsable boj2 = new smartphone();
        obj1.call();
        boj2.browse();
        smartphone sm = new smartphone();
        sm.browse();
        sm.call();
    }
}
