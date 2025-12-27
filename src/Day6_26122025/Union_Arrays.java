package Day6_26122025;
// Find the union of two arrays
public class Union_Arrays {

    public static int[] solution1(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] temp = new int[n+m];
        int left = 0;
        int right = 0;
        int index = 0;
        int pre = Integer.MIN_VALUE;
        while(left < n && right < m){
            if(left > 0  && arr1[left] == arr1[left-1]){
                left++;
                continue;
            }
            if(right > 0 && arr2[right] == arr2[right-1]){
                right++;
                continue;
            }

            if(arr1[left] < arr2[right]){
                if(arr1[left] != pre){
                    temp[index++] = arr1[left];
                    pre = arr1[left];
                }
                left++;
            }
            else if(arr2[right] < arr1[left]){
                if(arr2[right] != pre){
                    temp[index++] = arr2[right];
                    pre = arr2[right];
                }
                right++;
            }
            else{
                if(arr1[left] != pre){
                    temp[index++] = arr1[left];
                }
                left++;
                right++;
            }
        }
        while(left < n){
            if(left == 0 || arr1[left] != arr1[left-1]){
                if(arr1[left] != pre){
                    temp[index++] = arr1[left];
                }
            }
            left++;
        }
        while(right < m){
            if(right == 0 || arr2[right] != arr2[right-1]){
                if(arr2[right] != pre){
                    temp[index++] = arr2[right];
                }
            }
            right++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6};
        int[] arr2 = {2,3,6,7,8};
        int[] result = solution1(arr1, arr2);
        for(int i : result) System.out.print(i+" ");
    }
}
