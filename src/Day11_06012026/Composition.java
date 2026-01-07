package Day11_06012026;
// Composition has-a relationship

class Engine
{
    public void start(){
        System.out.println("Engine start");
    }
    public void stop(){
        System.out.println("Engine stop");
    }
}

class Car
{
    private Engine engine;
    public Car(){
        engine = new Engine();
    }
    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
    public void park(){
        engine.stop();
        System.out.println("Car is parked");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
        obj.park();
    }
}
