package Day10_02012026;

class Person
{
    private String name;
    private int age;
    private String country;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCountry(String c){
        this.country = c;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getAge(){
        return age;
    }
}


public class Program_4 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(20);
        obj.setName("John");
        obj.setCountry("USA");
        System.out.println(obj.getAge());
        System.out.println(obj.getCountry());
        System.out.println(obj.getName());
    }
}
