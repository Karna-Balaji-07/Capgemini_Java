package OOPs.Abstraction;

abstract class Vehicle
{
    abstract void engineStart();
}

class car extends Vehicle
{
    @Override
    void engineStart() {
        System.out.println("Car engine started using ignition key");
    }
}

class Bike extends Vehicle{
    @Override
    void engineStart() {
        System.out.println("Bike engine started using kick/self start");
    }
}


public class Program_2 {
    public static void main(String[] args) {
        car c = new car();
        c.engineStart();
        Bike b = new Bike();
        b.engineStart();
    }

}
