import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        // Looping through the array
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                // Positive number
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            }
            else if (numbers[i] < 0) {
                // Negative number
                System.out.println(numbers[i] + " is Negative");
            }
            else {
                // Zero
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last elements
        System.out.println("\nComparison of First and Last Elements:");

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ")");
        }
        else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ")");
        }
        else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ")");
        }
    }
}
