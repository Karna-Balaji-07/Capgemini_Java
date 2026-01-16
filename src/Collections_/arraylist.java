
package Collections_;

import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < 10;i++){arr.add(i);}
        System.out.println(arr);
        // adding elements into arraylist
        System.out.print("Arraylist after adding element 11: ");
        arr.add(11);
        System.out.println(arr);
        arr.add(0,-1);
        System.out.println("Arraylist after adding element -1 at index 0: "+ arr);
        arr.addAll(new ArrayList<>(Arrays.asList(-9,-8,-7,-6,-5,-4)));
        System.out.println("Arraylist after adding new array into the list: "+arr);
        
        // accessing elements
        System.out.println("Element at index 6: "+arr.get(6));
        System.out.println("First element of the list: "+arr.getFirst());
        System.out.println("Last element of the list: "+arr.getLast());

        // Updating elements
        arr.set(3,11);
        System.out.println("Setting value at index 3 as 11: "+arr);

        // Removing elements
        arr.remove(11); // we can also remove the elements using element object as parameter
        //arr.removeAll(arr); // removes the whole arraylist
        System.out.println("Removing element at index 11: "+ arr);

        // Searching and editing 
        System.out.println("Checking if arraylist contains element 11: "+arr.contains(11));
        System.out.println("Checking if list contains element 13: "+arr.contains(13));
        System.out.println("First index of the element 6: "+arr.indexOf(6)); // returns the first element of the object element
        System.out.println("Last index of element -1: "+arr.lastIndexOf(-1)); // returns the index of the last occurrence of the object element
        System.out.println("Checking if list is empty : "+arr.isEmpty()); // checks if the arraylist is empty or not
        System.out.println("Length of array: "+arr.size()); // to get the size of the arraylist i.e. the number of elements

        // sublist and  conversion
        List<Integer> arr1 = arr.subList(2,8); // returns a sublist from start index till end index
        System.out.println("Sublist: "+arr1);
        Integer[] arrs = arr.toArray(new Integer[0]); // returns an array of Integers
        for(Integer i : arrs) System.out.print(i+" ");

        System.out.println("\n\nCollections methods applied to arraylist");
        // Collections methods for arraylist

        System.out.print("Sorted arraylist: ");
        Collections.sort(arr);
        System.out.println(arr);

        System.out.print("Reversed arraylist: ");
        Collections.reverse(arr);
        System.out.println(arr);

        System.out.print("Shuffled arraylist: ");
        Collections.shuffle(arr);
        System.out.println(arr);

        System.out.print("Searching for element using binary search : ");
        Collections.sort(arr);
        int res = Collections.binarySearch(arr,9);
        System.out.println(res);

        System.out.println("Maximum element in arraylist: "+ Collections.max(arr));
        System.out.println("Minimum element in arraylist: "+ Collections.min(arr));
    }
}
