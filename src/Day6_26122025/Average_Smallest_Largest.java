package Day6_26122025;
// Find the average of smallest and largest element in the array
public class Average_Smallest_Largest {

    public static double solution(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i < smallest) smallest = i;
            if(i > largest) largest = i;
        }
        int large = 0;
        int small = 0;
        for(int i : arr){
        if(smallest == i) small++;
        if(largest == i) large++;
        }

        return (double)((smallest * small)+(large * largest))/(small+large);

    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,4};
        System.out.println(solution(arr));
    }
}
