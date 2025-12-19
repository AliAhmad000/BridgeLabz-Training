import java.util.Scanner;

public class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Defining an array to store multiplication results (6 to 9)
        int[] multiplicationResult = new int[4];

        // Storing multiplication results in the array
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Displaying the multiplication table
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
