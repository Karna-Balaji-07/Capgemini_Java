package Array;

public class Count_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1,6,2,3,4,2,6,2,6,2,6,2,7,2,2,2};
        int count = 0;
        for(int i : arr){
            if(i == 2) count++;
        }
        System.out.println(count);
    }
}
