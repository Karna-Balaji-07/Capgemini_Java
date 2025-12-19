public class Decision_Making {
    public static void main(String[] args) {
        // decision-Making

        // If statement
        System.out.println("If Statement");
        int x = 10;
        if(x % 2== 0) System.out.println("Even");
        System.out.println();

        // If-Else statement
        System.out.println("If-Else statement");
        if(x > 15) System.out.println(x +" is greater than 15");
        else System.out.println(x+" is less than 15");
        System.out.println();

        // Nested If statement
        System.out.println("Nested-If statements");
        if(x  < 15){
            if(x == 10) System.out.println(x+" is equal 10 and less than 15");

        }
        System.out.println();

        // If - Else If - else statement
        System.out.println("If-Else if-Else statement");
        if(x == 5) System.out.println(x+" is equal to 5");
        else if(x==10) System.out.println(x+" is equal to 10");
        else if(x==15) System.out.println(x+" is equal to 15");
        else System.out.println(x+" is greater than 15");
        System.out.println();

        // Swtich statement
        System.out.println("Switch Statement");
        int num = 20;
        switch (num){
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");

        }
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator");
        int xx=10,yy=20;
        int max = (xx > yy)? xx: yy;
        System.out.println("Maximum of xx and yy : "+ max);

    }
}
