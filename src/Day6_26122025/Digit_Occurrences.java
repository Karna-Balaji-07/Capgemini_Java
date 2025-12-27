package Day6_26122025;
// Find the maximum occurrence of k in that digit
public class Digit_Occurrences {

    public static int digits_count(int n, int k){
        int count = 0;
        while(n > 0){
            int r = n % 10;
            if(r ==k) count++;
            n /= 10;
        }
        return count;
    }


    public static int solution(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        for(int i : arr){
            int count = digits_count(i,k);
            System.out.println("Element : "+ i + " and Count : "+ count);
            if(count > max) {
                result = i;
                max= count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {37, 823, 122, 2322, 6017};
        System.out.println(solution(arr,2));
    }
}
