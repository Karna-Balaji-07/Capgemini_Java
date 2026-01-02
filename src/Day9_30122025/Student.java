package Day9_30122025;
/* WAJP to create student class consist of 4 data such as id, name, percentage, college name
> create parameterized constructor to initialize only id
> create parameterized coonstructor to initialize only name
> create parameterized coonstructor to initialize only percentage
> create parameterized coonstructor to initialize only name and id
> create parameterized coonstructor to initialize only id and percentage
> create parameterized coonstructor to initialize only name and percentage
> create parameterized coonstructor to initialize only name, id and percentage
> create default constructor to assign default values
> create one static method called printDetails to print all the details of students
> in main method create objects using all constructors.
* */
public class Student {
    int id;
    String name;
    double percentage;
    String college;

    public Student()
    {
        System.out.println("Default constructor");
        this.id = 101;
        this.name = "Bravo";
        this.percentage = 100;
        this.college = "LPU";
    }

    public Student(int id)
    {
        System.out.println("ID constructor");
        this.id = id;
    }
    public Student(double percent)
    {
        System.out.println("Percentage constructor");
        this.percentage = percent;
    }
    public Student(String name)
    {
        System.out.println("String name constructor");
        this.name = name;
    }
    public Student(int id, String name)
    {
        System.out.println("ID and name constructor");
        this.id = id;
        this.name = name;
    }
    public Student(int id, double percentage)
    {
        System.out.println("ID and percentage constructor");
        this.id = id;
        this.percentage = percentage;
    }
    public Student(String name, double percentage)
    {
        System.out.println("Name and percentage constructor");
        this.name = name;
        this.percentage = percentage;
    }
    public Student(int id, double percentage, String name)
    {
        System.out.println("ID, percentage and name constructor");
        this.id = id;
        this.percentage = percentage;
        this.name = name;
    }

    public static void printDetails(Student s)
    {
        System.out.println("Static method");
        System.out.println("Student ID : "+ s.id);
        System.out.println("Student Name : "+ s.name);
        System.out.println("Student Percentage : "+ s.percentage);
        System.out.println("Student College : "+ s.college);
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 =new Student(100);
        Student s3 =new Student("Foxtrot");
        Student s4 =new Student(92.23);
        Student s5 =new Student(101,"Charlie");
        Student s6 =new Student(102,97.45);
        Student s7 =new Student("Delta",82.42);
        Student s8 =new Student(102,77.32,"Echo");
        printDetails(s1);
        System.out.println();
        printDetails(s2);
        System.out.println();
        printDetails(s3);
        System.out.println();
        printDetails(s4);
        System.out.println();
        printDetails(s5);
        System.out.println();
        printDetails(s6);
        System.out.println();
        printDetails(s7);
        System.out.println( );
        printDetails(s8);

    }


}
