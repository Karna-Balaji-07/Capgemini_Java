package Day4_23122025;


public class Program_14 {
    public static void main(String[] args) {
        // print prime numbers from the range 20 to 1

        for(int i = 20;i > 1;i--){
            boolean flag = true;

            for (int j = 2; j <= Math.sqrt(i) ; j++  ) {
                if( i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+" ");

        }
    }
}
