package ExceptionHandling;

public class Program_1 {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
            System.out.println(div);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Unable to divide an integer by 0");
        }
    }
}
