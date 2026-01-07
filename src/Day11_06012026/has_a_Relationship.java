package Day11_06012026;
// Aggregation relationship
class Address
{
    String city;
    String state;
    public Address(String c, String s){
        this.city = c;
        this.state = s;
    }
}

class Student
{
    String StudentName;
    int StudentID;
    double marks;
    Address address;
    public Student(String name, int id, double mark, Address address){
        this.marks = mark;
        this.StudentID =id;
        this.StudentName=name;
        this.address = address;
    }
    public void display(){
        System.out.println("Student ID : "+ StudentID);
        System.out.println("Student name : "+ StudentName);
        System.out.println("Student marks : "+ marks);
        System.out.println("Student address : "+ address.city+", "+address.state);

    }
}


public class has_a_Relationship {
    public static void main(String[] args) {
        Address ad = new Address("Jalandhar","Punjab");
        Student s1 = new Student("Kilo",101,88.8,ad);
        s1.display();


    }
}
