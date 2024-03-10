import java.util.*;
import java.util.Iterator;

public class StudentCollection {
    private int StudentId;
    private String StudentName;
    private int PhoneNumber;

    StudentCollection() {
    }

    StudentCollection(int id, String n, int ph) {
        StudentId = id;
        StudentName = n;
        PhoneNumber = ph;
    }

    public int getId() {
        return StudentId;
    }

    public String getName() {
        return StudentName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setId(int X) {
        StudentId = X;
    }

    public void setName(String X) {
        StudentName = X;
    }

    public void setPhoneNumber(int X) {
        PhoneNumber = X;
    }

    @Override
    public String toString() {
        return "StudentId : " + StudentId + "\n" + "StudentName : " + StudentName + "\n" + "PhoneNumber : "
                + PhoneNumber;
    }

    public void Disp() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        StudentCollection Student1 = new StudentCollection();
        Student1.setId(1001);
        Student1.setName("BABB");
        Student1.setPhoneNumber(246802);
        System.out.println(Student1.toString());
        StudentCollection Student2 = new StudentCollection(1002, "ABCD", 135791);
        Student2.Disp();
        System.out.println();
        ArrayList<StudentCollection> Students = new ArrayList<>();
        Students.add(Student1);
        Students.add(Student2);
        for (int i = 0; i < 3; i++) {
            Students.add(new StudentCollection(1003 + i, "ABCD" + i, 246899));
        }
        for (StudentCollection Student : Students) {
            Student.Disp();
        }
        System.out.println();
        Iterator<StudentCollection> Student = Students.iterator();
        while (Student.hasNext()) {
            Student.next().Disp();
        }
    }
}
