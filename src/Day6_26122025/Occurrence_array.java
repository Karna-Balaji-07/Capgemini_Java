package Day6_26122025;
// Print the occurrence of each element in the array without using collections
public class Occurrence_array {

    public static int[] solution(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int count = 0;
            for (int k : arr) {
                if (k == curr) count++;
            }
            temp[i] = count;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,6,7,8,2,2,2,9};
        int[] result = solution(arr);
        for(int i : result){
            System.out.print(i+" ");

        }
    }

}
