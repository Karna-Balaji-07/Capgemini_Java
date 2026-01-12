package Day13_08012026;
/* Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
 Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 */
class Vehicle
{
    void speedUp(){
        System.out.println("Increase Speed");
    }
}

class Car extends Vehicle{
    @Override
    void speedUp() {
        System.out.println("Car speeding 50MPH");
    }
}

class Bike extends Vehicle{
    @Override
    void speedUp() {
        System.out.println("Bike speeding 80MPH");
          }
}

public class Program_1 {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle bike = new Bike();
        Vehicle v = new Vehicle();
        car.speedUp();
        bike.speedUp();
        v.speedUp();
    }
}
