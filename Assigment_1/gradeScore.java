import java.util.Scanner;
public class gradeScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int marks = scanner.nextInt();
        System.out.println("Grade: "+ calculateGrade(marks));
    }
    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
