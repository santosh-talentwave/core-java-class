package day4.oops;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        //set
        student.setStudentName("Rahul Sharma");
        student.setRollNo(13);
        //get
        System.out.println(student.getStudentName());
        System.out.println(student.getRollNo());
    }
}
