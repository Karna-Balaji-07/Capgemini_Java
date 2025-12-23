package Day4_23122025;

public class Program_21 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 32; i < 50; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;


            }
        }
        System.out.println("Addition of all Prime Numbers  are : "+ sum);
    }
}
