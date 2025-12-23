package Day4_23122025;

public class Loops {
    public static void main(String[] args) {

        // for loop
        System.out.println("For loop");
        for (int i = 0; i < 11; i++) {
            System.out.print(i+" ");
        }

        System.out.println("\nfor each");

        // for each loop
        int[] arr = {3,8,5,7,1,9,2,10};
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\nWhile loop");

        // While loop
        int i =1;
        while(i < 11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\ndo while");
        // do while
        int k = 1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k <= 10);

        System.out.println("\nContinue statement");
        // continue statement
        for (int j = 0; j < 11; j++) {
            if(j % 2 == 0) continue;
            System.out.print(j+" ");
        }

        System.out.println("\nBreak statement");
        // break statement
        for (int j = 1; j < 11; j++) {
            if(j % 5 == 0) break;
            System.out.print(j+" ");
        }

    }
}
