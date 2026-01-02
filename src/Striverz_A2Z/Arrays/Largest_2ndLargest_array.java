package Striverz_A2Z.Arrays;
// find the largest and second largest element in the array without sorting


public class Largest_2ndLargest_array {
    public static void solution1(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i > largest)
            {
                second = largest;
                largest = i;
            }
            else if(i > second && i < largest){
                second = i;
            }
        }
        System.out.println("Largest Element in array : "+ largest);
        System.out.println("Second largest elemtn in array : "+second);
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 7, 9};
        solution1(arr);
    }
}
