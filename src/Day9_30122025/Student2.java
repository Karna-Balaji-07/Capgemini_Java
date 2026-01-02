package Day9_30122025;

public class Student2 {

    int id;
    String name;
    int[] marks;

    public Student2(int id, String name, int[] marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student2(Student2 obj)
    {
        this.id = obj.id;
        this.name = obj.name;
        this.marks = obj.marks;
    }

    public static void main(String[] args) {
        int[] marks = {92,89,82};
        Student2 obj1 = new Student2(1001, "Delta", marks);
        Student2 obj2 = new Student2(obj1);
        obj2.marks = new int[]{87, 79, 77};
        System.out.println("Constructor 1 : ");
        System.out.println("Student id : "+ obj1.id);
        System.out.println("Student name : "+obj1.name);
        System.out.print("Marks of obj1 : ");
        for(int i : obj1.marks) System.out.print(i+" ");
        System.out.println();
        System.out.println("Constructor");
        System.out.println("Student id : "+ obj2.id);
        System.out.println("Student name : "+obj2.name);
        System.out.print("Marks of obj2 : ");
        for(int i : obj2.marks) System.out.print(i+" ");
        System.out.println();

    }
}
