package OOPs.StaticMembers;

class Counter{
    static int count;
    public Counter(){
        count++;
        System.out.println("Count : "+count);
    }
}

public class Static_Variables {
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();
        Counter obj6 = new Counter();
        Counter obj7 = new Counter();
        Counter obj8 = new Counter();
        System.out.println(Counter.count);

    }

}
