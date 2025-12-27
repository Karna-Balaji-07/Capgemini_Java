package Day6_26122025;
// Count elements that are divisible by k
public class Count_Divisibility_k {

    public static int solution(int[] arr, int k){
        int count = 0;
        for(int i : arr){
            if(k % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {9,-13,-8,8,10,18};
        int k = 18;
        System.out.println(solution(arr,k));
    }

}
