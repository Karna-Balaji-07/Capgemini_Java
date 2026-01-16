// object clas

public class Object_Class {
    
    String name;
    String address;
    int id = 3243;
    Object_Class(String n, String a){
        this.name = n;
        this.address = a;
    }

   public String toString(){
        return "Name : "+ name+"\nAddress: "+ address;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object obj){
        Object_Class o = (Object_Class) obj;
        return this.address.equals(o.address);
    }

    
    public static void main(String[] args) {
        Object_Class obj = new Object_Class("John","NewYork");
        Object_Class obj2 = new Object_Class("Jon","NewYork" );
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));

    }    
}
