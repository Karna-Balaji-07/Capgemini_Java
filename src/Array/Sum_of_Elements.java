package Array;

public class Sum_of_Elements {
    public static void main(String[] args) {
        // sum of all elements of array
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
    }
}
