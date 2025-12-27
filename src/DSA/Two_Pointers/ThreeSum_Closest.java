package DSA.Two_Pointers;

import java.util.Arrays;

// Triplet sum closest to target
public class ThreeSum_Closest {

    public static int solution1(int[] arr, int target){
        Arrays.sort(arr);
        int result = 0;
        int mindiff = Integer.MAX_VALUE;
        for(int first = 0; first < arr.length-2;first++){
            int second = first+1;
            int third = arr.length-1;
            while(second < third){
                int curr = arr[first]+arr[second]+arr[third];
                if(Math.abs(target-curr) < mindiff){
                    mindiff = Math.abs(target-curr);
                    result = curr;
                }
                if(Math.abs(target-curr) == mindiff){
                    result = Math.max(curr, result);
                }
                if(curr > target) third--;
                else second++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 2, 4};
        int target = 4;
        System.out.println(solution1(arr, target));
    }

}
