package Basic_Programs;

import java.util.Scanner;

public class Java_EOF {
    public static void main(String[] args) {

        // To keep on taking the input till the end of file
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
