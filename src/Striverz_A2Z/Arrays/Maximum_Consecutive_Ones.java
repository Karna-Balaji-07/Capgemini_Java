package Striverz_A2Z.Arrays;
// Find the maximum consecutive ones

public class Maximum_Consecutive_Ones {
    public static int solution1(int[] arr)
    {
        int n = arr.length;
        int count=0;
        int left = 0;
        int result=Integer.MIN_VALUE;
        int right = 0;
        for(right = 0;right < arr.length;right++){
            if(arr[right] == 0){
                count = right-left;
                result = Math.max(result, count);
                left = right+1;
            }
        }
        result= Math.max(result, right-left);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(solution1(arr));
    }
}
