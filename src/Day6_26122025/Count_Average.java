package Day6_26122025;
// Count the elements equal to the average of all elements
public class Count_Average {

    public static int solution(int[] arr){
        int count = 0;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int ag = sum / arr.length;

        for(int i : arr){
            if(ag == i) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2,2};
        System.out.println(solution(arr));
    }

}
