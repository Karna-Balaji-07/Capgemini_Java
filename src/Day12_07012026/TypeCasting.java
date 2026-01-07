package Day12_07012026;


class Father{
    int b = 100;
    public void profession(){
        System.out.println("Father is a Professor");
    }
    public void relationship(){
        System.out.println("Father relationship");
    }
    public void hobby(){
        System.out.println("Father hobby is news");
    }
}

class Son extends Father{
    int a = 25;
    public void profession1(){
        System.out.println("Son is software engineer");
    }
    public void hobby1(){
        System.out.println("Son hobby is movies");
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Upcasting from Son to father");
        Father ref1 = new Son();
        ref1.profession();
        ref1.relationship();
        ref1.hobby();
        System.out.println(ref1.b);
        System.out.println();

        System.out.println("Downcasting from father to son");
        Son ref2 = (Son) ref1;
        ref2.hobby();
        ref2.profession();
        ref2.relationship();
        ref2.profession();
        System.out.println(ref2.a);
        System.out.println(ref2.b);
    }

}
