import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // 2D array to store marks
        // Column 0 -> Physics, Column 1 -> Chemistry, Column 2 -> Maths
        int[][] marks = new int[number][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Taking marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics"
                                 : (j == 1) ? "Chemistry"
                                 : "Maths";

                System.out.print("Enter marks in " + subject + ": ");
                int value = sc.nextInt();

                if (value < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter student details.");
                    i--;      // repeat the same student
                    break;
                }

                marks[i][j] = value;
            }
        }

        // Calculate percentage and grade using the 2D marks array
        for (int i = 0; i < number; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

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

        // Displaying the results
        System.out.println("\n--- Student Result Report ---");
        for (int i = 0; i < number; i++) {
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
