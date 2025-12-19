import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3];     // 0-Physics, 1-Chemistry, 2-Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Takeing input for marks 
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print("Enter marks in " + subject + ": ");
                int value = sc.nextInt();

                if (value < 0) {
                    System.out.println("Marks cannot be negative. Re-enter student data.");
                    i--;        // decrement index to repeat this student
                    break;
                }

                marks[i][j] = value;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Displaying results
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println();
        }
    }
}
