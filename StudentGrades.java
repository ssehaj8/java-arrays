import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create a single 1D array to store marks of all students in all subjects
        double[] marks = new double[n * 3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Take input for marks and ensure positive values
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            do {
                System.out.print("Physics: ");
                marks[i * 3] = sc.nextDouble();
                if (marks[i * 3] < 0 || marks[i * 3] > 100) {
                    System.out.println("Please enter valid marks between 0 and 100.");
                }
            } while (marks[i * 3] < 0 || marks[i * 3] > 100);

            do {
                System.out.print("Chemistry: ");
                marks[i * 3 + 1] = sc.nextDouble();
                if (marks[i * 3 + 1] < 0 || marks[i * 3 + 1] > 100) {
                    System.out.println("Please enter valid marks between 0 and 100.");
                }
            } while (marks[i * 3 + 1] < 0 || marks[i * 3 + 1] > 100);

            do {
                System.out.print("Maths: ");
                marks[i * 3 + 2] = sc.nextDouble();
                if (marks[i * 3 + 2] < 0 || marks[i * 3 + 2] > 100) {
                    System.out.println("Please enter valid marks between 0 and 100.");
                }
            } while (marks[i * 3 + 2] < 0 || marks[i * 3 + 2] > 100);

            // Calculate percentage
            percentage[i] = (marks[i * 3] + marks[i * 3 + 1] + marks[i * 3 + 2]) / 3.0;

            // Determine grade
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } 
            else if (percentage[i] >= 80) {
                grade[i] = "B";
            } 
            else if (percentage[i] >= 70) {
                grade[i] = "C";
            } 
            else if (percentage[i] >= 60) {
                grade[i] = "D";
            } 
            else {
                grade[i] = "F";
            }
        }

        // Display results
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f%%\t%s\n", marks[i * 3], marks[i * 3 + 1], marks[i * 3 + 2], percentage[i], grade[i]);
        }
    }
}
