package Day6_26122025;
// Find the product of all the elements in the array
public class Product_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int prod = 1;
        for(int i : arr){
            prod *= i;
        }
        System.out.println(prod);
    }
}
