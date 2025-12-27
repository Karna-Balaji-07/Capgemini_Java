package Day6_26122025;
/*
FInd the smallest, second smallest and third smallest
find the largest, second largest, and third largest
 */
public class Smallest_Largest_array {

    public static void smallest(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < first) {
                third = second;
                second = first;
                first = i;
            }
            else if(i < second && i > first){
                third =second;
                second = i;
            }
            else if(i < third && i > second){
                third = i;
            }
        }
        System.out.println("Smallest : "+ first);
        System.out.println("Second smallest : "+second);
        System.out.println("Third smallest : "+ third);
    }

    public static void largest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > first) {
                third = second;
                second = first;
                first = i;
            }
            else if(i > second && i < first){
                third =second;
                second = i;
            }
            else if(i > third && i < second){
                third = i;
            }
        }
        System.out.println("largest : "+ first);
        System.out.println("Second largest : "+second);
        System.out.println("Third largest : "+ third);
    }


public static void main(String[] args) {
    int[] arr = {81,22,51,61,18,12,11,98,88,61};
    System.out.println("Smallest");
    smallest(arr);
    System.out.println("Largest");
    largest(arr);
}
}
