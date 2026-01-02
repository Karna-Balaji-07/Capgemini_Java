package Day9_30122025;

public class SmartDevice
{
    String deviceName;
    String os;
    int batteryCapacity;

    public SmartDevice()
    {
        this.deviceName = "Laptop";
        this.os = "Windows";
        this.batteryCapacity = 10000;
    }
    public SmartDevice(String device)
    {
        this();
        this.deviceName = device;
    }
    public SmartDevice(String device, String OS)
    {
        this();
        this.deviceName = device;
        this.os = OS;
    }
    public SmartDevice(String device, String os, int battery)
    {
        this.deviceName = device;
        this.os = os;
        this.batteryCapacity = battery;
    }

    public static void main(String[] args) {
        SmartDevice obj1 = new SmartDevice("Apple Mac", "MacOS",12000);
        System.out.println(obj1.deviceName);
        System.out.println(obj1.os);
        System.out.println(obj1.batteryCapacity);

        SmartDevice obj2 = new SmartDevice("Apple Mac 2");
        System.out.println(obj2.deviceName);
        System.out.println(obj2.os);
        System.out.println(obj2.batteryCapacity);

        SmartDevice obj3 = new SmartDevice("Apple Mac 3", "MacOS401");
        System.out.println(obj3.deviceName);
        System.out.println(obj3.os);
        System.out.println(obj3.batteryCapacity);



    }


}
