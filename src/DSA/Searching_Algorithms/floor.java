package DSA.Searching_Algorithms;
// Floor in sorted array
public class floor {

    public static int solution1(int[] arr, int x)
    {
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] <= x) return i;
        }
        return -1;
    }

    public static int solution2(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high) /2;
            if (arr[mid] > x) high = mid-1;
            else {
                result = mid;
                low = mid+1;
            }
                    }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x1 = 5;
        int x2 = 20;
        System.out.println(solution1(arr, x1));
        System.out.println(solution2(arr,x1));
        System.out.println(solution2(arr, x2));
    }

}
