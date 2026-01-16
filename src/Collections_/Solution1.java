package Collections_;
import java.util.*;
public class Solution1 {
    
}

class Student
{
    private int rollNumber;
    private String studentName;
    private boolean attendanceStatus;

    public Student(int roll, String s, boolean a){
        this.rollNumber = roll;
        this.studentName = s;
        this.attendanceStatus = a;
    }
    public void StudentDetails(){
        if(attendanceStatus) System.out.println("Roll No: "+ rollNumber+", Name: "+ studentName+", Attendance: Present");
        else System.out.println("Roll No: "+ rollNumber+", Name: "+ studentName+", Attendance: Absent");
    }

    public void setAttendance(boolean b){this.attendanceStatus = b;}
    

}

class AttendanceManager
{
    List<Student> arr = new ArrayList<>();

    public void addStudent(Student std) {arr.add(std);}
    public 
}
