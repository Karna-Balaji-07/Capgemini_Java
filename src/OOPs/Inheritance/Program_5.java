package OOPs.Inheritance;

class Device
{
    String brand;
    boolean powerStatus;

    public Device(String s){
        this.brand = s;
        this.powerStatus = false;
        System.out.println("Device constructor is called");
    }

    public void turnOn(){
        powerStatus = true;
        System.out.println("Device is turned On");
    }
    public void turnOff(){
        powerStatus = false;
        System.out.println("Device is turned Off");
    }
}

class Mobile extends Device
{
    String phoneNumber;

    public Mobile(String brand, String phone){
        super(brand);
        this.phoneNumber = phone;
        System.out.println("Mobile constructor is called");
    }
    public void makeCall(String phone){
        if(powerStatus) System.out.println("Calling "+ phone+" from "+ phoneNumber);
        else System.out.println("Phone is OFF");
    }
}

class SmartPhone extends Mobile{
    String OS;
    public SmartPhone(String brand, String phone, String os){
        super(brand, phone);
        this.OS = os;
        System.out.println("Smartphone constructor is called");
    }
    public void browseInternt(){
        if(powerStatus){
            System.out.println("Browing internet through phone using "+ OS);
        }
        else System.out.println("Power is Off. Cannot browse internt");
    }
}

public class Program_5
{
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Samsung","xxx-xxx-xxx","Android 17");
        System.out.println("Phone brand : "+ phone.brand);
        System.out.println("Phone OS : "+ phone.OS);
        phone.makeCall("XXX-XXX-XXX");
        phone.turnOn();
        phone.browseInternt();
        phone.turnOff();
    }
}
