// ARRAYLISTS

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // adding elements to the list
        for (int i = 1; i <= 20; i++) {
            arr.add(i);
        }

        // adds element in the specified position in the list
        arr.add(3,1);

        // checks if the element is present in the list
        System.out.println(arr.contains(8));

        // retreives the element from the list
        System.out.println(arr.get(6));

        // indexOf
        System.out.println(arr.indexOf(11));

        // removes element from the list
        arr.remove(18);

        // size of the list
        System.out.println(arr.size());

        Integer[] arrs = (Integer[]) arr.toArray();


    }
}

