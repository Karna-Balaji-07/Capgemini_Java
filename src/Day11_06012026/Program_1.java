package Day11_06012026;
// wajp to create a static method that returns the address of an object
public class Program_1
{
    public static Program_1 solution(Program_1 obj){
        return obj ;
    }

    public static void main(String[] args) {
        Program_1 obj = new Program_1();
        System.out.println(solution(obj));
    }
}
