package Collections_;

// accessing elements using iterator
import java.util.*;
public class iterators {
    public static void main(String[] args) {
         int[] nums = {10,21,23,24,24,24,24,26,26,26,26,47,34,67,12,11,16,29,35};
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(0);
        for(int i : nums) {
            arr.add(i) ;
            set.add(i);
        }
        Collections.sort(arr);

        Iterator<Integer> itr = arr.iterator();
        Iterator<Integer> itrs = set.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        while(itrs.hasNext()){
            System.out.print(itrs.next()+" ");
        }
}
    
}
