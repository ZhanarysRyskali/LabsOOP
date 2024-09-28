import practice2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A", 1));
        students.add(new Student("B", 2));
        students.add(new Student("C", 3));
        students.add(new Student("D", 4));

        int[] grades = new int[students.size()];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input grades for students:");

        for (int i = 0; i < students.size(); i++) {
            System.out.print("Student " + students.get(i).getName() + ": ");
            grades[i] = scanner.nextInt();
        }

        Gradebook gradebook = new Gradebook(course, students, grades);
        gradebook.displayMessage();
        gradebook.displayGradeReport();
    }
}
