package OOPs.Inheritance;

class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
        Animal obj2= new Animal();
        obj2.makeSound();

    }
}
