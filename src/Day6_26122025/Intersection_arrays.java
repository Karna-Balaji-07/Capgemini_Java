package Day6_26122025;
// Intersection of two arrays without using collections

public class Intersection_arrays {

    public static int solution1(int[] arr1, int[] arr2, int[] temp)
    {
        int n = arr1.length;
        int m = arr2.length;
        int index = 0;
        for(int i = 0; i < n;i++){
            for(int j = 0;j < m;j++){
                if(arr1[i] == arr2[j]){
                    temp[index++] = arr1[i];
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7,8};
        int[] arr2 = {1,3,1,8,2,9};
        int[] temp = new int[arr1.length + arr2.length];
        for (int i = 0; i < solution1(arr1, arr2, temp); i++) {
            System.out.print(temp[i]+" ");
        }
    }

}
