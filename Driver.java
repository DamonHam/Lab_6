import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Prompt user to enter 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student <firstName> <lastName> <score>: ");
            String firstName = scanner.next();
            String lastName = scanner.next();
            int score = scanner.nextInt();
            students[i] = new Student(firstName, lastName, score);
        }

        // Use Arrays.sort() to sort the array
        Arrays.sort(students);

        // Print sorted students
        System.out.println("\nSorted Students (Highest to Lowest):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
