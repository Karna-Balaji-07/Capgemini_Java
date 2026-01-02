package Day9_30122025;

public class MobilePhone
{
    String brand;
    int storage;
    boolean is5G;

    public MobilePhone()
    {
        this.brand = "Unknown";
        this.storage=64;
        this.is5G = false;
    }

    public MobilePhone(int storage)
    {
        this();
        this.storage = storage;
    }
    public MobilePhone(String brand)
    {
        this();
        this.brand = brand;
    }
    public MobilePhone(boolean is5G)
    {
        this();
        this.is5G=is5G;
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone(128);
        System.out.println(phone1.brand);
        System.out.println(phone1.is5G);
        System.out.println(phone1.storage);

        MobilePhone phone2 = new MobilePhone("Nokia");
        System.out.println(phone2.brand);
        System.out.println(phone2.is5G);
        System.out.println(phone2.storage);

        MobilePhone phone3 = new MobilePhone(true);
        System.out.println(phone3.brand);
        System.out.println(phone3.is5G);
        System.out.println(phone3.storage);
    }

}
