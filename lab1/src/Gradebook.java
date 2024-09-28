import practice2.Student;
import java.util.ArrayList;

public class Gradebook {
    private Course course;
    private ArrayList<Student> students;
    private int[] grades;

    public Gradebook(Course course, ArrayList<Student> students, int[] grades) {
        this.course = course;
        this.students = students;
        this.grades = grades;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.name + "!");
    }

    public double determineClassAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }

    public void outputBarChart() {
        int[] gradeDistribution = new int[11];

        for (int grade : grades) {
            gradeDistribution[grade / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            for (int stars = 0; stars < gradeDistribution[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void displayGradeReport() {
        double average = determineClassAverage();
        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;
        Student bestStudent = null, lowestStudent = null;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
                bestStudent = students.get(i);
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
                lowestStudent = students.get(i);
            }
        }

        System.out.printf("Class average is %.2f.\n", average);
        System.out.println("Highest grade is " + highestGrade + " (" + bestStudent + ").");
        System.out.println("Lowest grade is " + lowestGrade + " (" + lowestStudent + ").");

        outputBarChart();
    }

    public String toString() {
        return "Gradebook[course=" + course + ", students=" + students + ", grades=" + java.util.Arrays.toString(grades) + "]";
    }


}
