import java.util.Scanner;

public class StoreAndSumNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating an  array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        // Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if array size limit reached
            if (index == 10) {
                break;
            }

            // Storing values in array
            numbers[index] = input;
            index++;
        }

        // Displaying all entered numbers and calculating total
        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Displaying total
        System.out.println("\nTotal of entered numbers: " + total);
    }
}
