package DSA.Searching_Algorithms;
// count 1s in sorted non increasing array
public class Count_1s {

    public static int solution1(int[] arr)
    {
        int count = 0;
        for(int i : arr){
            if(i == 1) count++;
        }
        return count;
    }

    public static int solution2(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high) /2;
            if(arr[mid] == 0) high = mid-1;
            else if(arr[mid] != 1 || mid == arr.length-1) return mid+1;
            else low = mid+1;
        }
        return 0;
    }

}
