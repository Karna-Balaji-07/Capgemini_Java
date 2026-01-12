package Day17_12012025;

import java.util.Scanner;

public class NullPointerException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            String s = input.nextLine();
            System.out.println(s);
            String w = null;
            System.out.println(w.length());
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception handled");
        }
    }
}
