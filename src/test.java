// Program to print hello world



public class test {
    static{
        System.out.println("a");
    }
    int a = 10;
    int b = 20;
    static int c = 30;
    public test(int a){
        System.out.println("Constructor");
    }

    public void sol(int a, int b, int c){
        System.out.println(this.a+this.b+test.c);
    }
    public static void main(String[] args){
        System.out.println("Hello to the world");
        test t = new test(10);
        //System.out.println("hello");
        t.sol(5,6,7);
    }
}
