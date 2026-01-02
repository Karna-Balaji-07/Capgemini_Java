package OOPs;

class Car
{
    private int miles;
    private String model;

    public void getSet(int mile, String models){
        this.miles = mile;
        this.model = models;
    }
    public int getMiles(){
        return this.miles;
    }
    public String getMode(){
        return this.model;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.getSet(100,"KIA");
        System.out.println(obj.getMiles());
        System.out.println(obj.getMode());
    }
}
