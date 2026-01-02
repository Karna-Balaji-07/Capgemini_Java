package OOPs.StaticMembers;

class MathUtility
{
    public static int sum(int a, int b)
    {
        return a+b;
    }
}


public class Static_Method {
    public static void main(String[] args) {
        System.out.println(MathUtility.sum(10,33));
    }
}
