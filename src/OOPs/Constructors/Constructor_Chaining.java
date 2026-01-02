package OOPs.Constructors;

class Student{
    int studentID;
    String name;
    char grade ;

    public Student(){
       this(1001,"Honey",'B');
    }

    public Student(int id, String name, char grade)
    {
        this.studentID = id;
        this.name = name;
        this.grade = grade;
    }
}


public class Constructor_Chaining {
    public static void main(String[] args) {
        Student obj = new Student(1001, "Jon",'A');
        System.out.println(obj.name);
        System.out.println(obj.studentID);

        Student obj2 = new Student();
        System.out.println(obj2.name);
        System.out.println(obj2.studentID);
    }
}
