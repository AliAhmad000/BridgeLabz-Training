import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define maxDigit and array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index variable
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {

            if (index == maxDigit) {
                break; // stop if array limit reached
            }

            digits[index] = number % 10;  // get last digit
            number = number / 10;          // remove last digit
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying results
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
