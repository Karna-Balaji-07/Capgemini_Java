package Day19_14012025;

// Remove objects from the list one by one
/* [10,21,23,25,26]
    [21,23,25,26]
    [23,25,26]
    [25,26]
    [26]
 */
import java.util.*;
public class Program_3 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10,21,23,25,26));
        Iterator<Integer> itr = arr.iterator();
        System.out.println(arr);
        while(itr.hasNext()){
            itr.next();
            itr.remove();
            System.out.println(arr);
        }

    }
}
