package Array;

public class Maximum_Minimum {
    public static void main(String[] args) {
        // Find the maximum and minimum element of array
        int[] arr = {1,6,3,4,2,6,9,6,2,6,8,7,1,6,10};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        System.out.println("Maximum element in the array is "+max);
        System.out.println("Minimum element in the array is "+min);

    }
}
