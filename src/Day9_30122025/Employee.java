package Day9_30122025;
/*
A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
 */
public class Employee
{
    int id;
    Address address;
    public Employee(int id, Address address)
    {
        this.id = id;
        this.address = address;
    }

    public Employee(Employee obj)
    {
        this.id = obj.id;
        this.address = obj.address;
    }

    public static void main(String[] args) {
        Address obj1 = new Address("Delhi");
        Employee obj = new Employee(100, obj1);
        System.out.println(obj.id);
        System.out.println(obj.address.city);
        Employee obj2 = new Employee(obj);
        System.out.println(obj2.id);
        System.out.println(obj2.address.city);

    }

}

class Address
{
    String city;
    public Address(String city)
    {
        this.city = city;
    }

}
