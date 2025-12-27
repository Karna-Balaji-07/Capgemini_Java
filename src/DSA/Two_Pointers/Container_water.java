package DSA.Two_Pointers;
// Container with most water
public class Container_water {

    public static int solution1(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int result = 0;
        while(left < right){
            int area = Math.min(arr[left], arr[right]) * (right-left);
            result = Math.max(area, result);
            if(arr[left]> arr[right]) right--;
            else left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(solution1(arr));
    }

}
