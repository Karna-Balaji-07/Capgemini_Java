package DSA.Searching_Algorithms;
// Linear searching
public class Linear_Search {

    public static boolean linear(int[] arr, int target){
        for(int i : arr){
            if(i == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 4;
        System.out.println(linear(arr, target));
    }
}
