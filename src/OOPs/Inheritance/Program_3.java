package OOPs.Inheritance;

import javax.net.ssl.HostnameVerifier;

class Employee{
    int salary;

    public Employee(int sal){
        this.salary = sal;
    }
    public void getWork(){
        System.out.println("Get some work from the manager and complete it");
    }

    public int getSalary(){
        return salary;
    }
}

class HRManager extends Employee{
    public HRManager(int sal){
        super(sal);
    }
    public void getWork(){
        System.out.println("HR Manager work");
    }
    public void addEmployee(){
        System.out.println("Add new employee");
    }
}



public class Program_3 {
    public static void main(String[] args) {
        Employee obj1 = new Employee(15990);
        System.out.println(obj1.salary);
        obj1.getWork();
        HRManager obj2 = new HRManager(12900);
        System.out.println(obj2.salary);
        obj2.getWork();
        obj2.addEmployee();
    }
}
