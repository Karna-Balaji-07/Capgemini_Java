package DSA.Searching_Algorithms;
// Find the bitonic point in the array
public class Bitonic_Point {

    public static int solution1(int[] arr)
    {
        for(int i = arr.length-2; i >=0 ;i--){
            if(arr[i] > arr[i+1]) return arr[i];
        }
        return -1;
    }

    public static int solution2(int[] arr)
    {
        int low = 0;
        int high = arr.length-2;
        while(low <= high)
        {
            int mid = (low+high) /2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return arr[mid];
            if(arr[mid] < arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {40,50,60,70,80,10,20,30};
        System.out.println(solution1(arr));
    }

}
