package Day6_26122025;
// Find the product of array except self;
public class Product_Array_Except_Self {

    public static int[] solution1(int[] arr){
        int zeros = 0;
        int index = 0;
        int prod = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]== 0){
                zeros ++;
                index = i;
            }
            else{
                prod *= arr[i];
            }
        }

        int[] result = new int[arr.length];
        if(zeros == 0){
            for(int i = 0;i< arr.length;i++){
                result[i] = prod / arr[i];
            }
        }
        else{
            result[index] = prod;
        }
        return result;
    }

}
