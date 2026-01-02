package Day10_02012026;

class Employee
{
    private String EmpName;
    private int EmpID;
    private double salary=10019;

    public void setEmpID(int empID) {
        this.EmpID = empID;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getSalary() {
        return String.format("$%.2f",salary);
    }
}


public class Program_5 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmpID(10001);
        obj.setEmpName("John");
        System.out.println(obj.getEmpID());
        System.out.println(obj.getSalary());
        System.out.println(obj.getEmpName());
    }
}
