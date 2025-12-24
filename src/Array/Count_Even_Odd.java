package Array;

public class Count_Even_Odd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,13,1,12,16};
        int even = 0;
        int odd = 0;
        for(int i : arr){
            if(i % 2 == 0) even ++;
            else odd++;
        }
        System.out.println("Count of even numbers in the array is "+even);
        System.out.println("Count of odd numbers in the array is "+odd);
    }
}
