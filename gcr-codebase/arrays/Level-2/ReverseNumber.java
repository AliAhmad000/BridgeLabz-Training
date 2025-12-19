import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Count how many digits are present in the number
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Array to store the digits of the number
        int[] digits = new int[digitCount];

        tempNumber = number;
        int index = 0;

        // Extract digits and store them in the array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        // Array to store digits in reverse order
        int[] reverseDigits = new int[digitCount];

        // Reverse the digits array
        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseDigits[i]);
        }
    }
}
