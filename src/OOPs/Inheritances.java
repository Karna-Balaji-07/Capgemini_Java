package OOPs;

public class Inheritances {
    public static void main(String[] args) {
        car obj = new car();
        System.out.println(obj.i);
        bus obj1 = new bus();
        truck obj2 = new truck(11);
        System.out.println(obj2.i);
    }
}

class Vehicle
{
    int i;
    public Vehicle(int i){
        System.out.println("Inside Vehicle class : Parent class");
        this.i = i;
    }
}
class car extends Vehicle{
    public car(){
        super(10);
        System.out.println("Inside car class : Using simple inheritance");
    }
}

class bus extends car{
    public bus(){
        System.out.println("Inside Bus class : Multilevel inheritance");
    }
}

class truck extends Vehicle{

    public truck(int i) {
        super(i);
        System.out.println("Inside truck class : Hierarchical inheritance");
    }
}


