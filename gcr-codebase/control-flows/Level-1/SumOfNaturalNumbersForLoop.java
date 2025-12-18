import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if natural number (0 or positive integer)
        if (n >= 0) {

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            // Printing Outputs
            System.out.println("Sum using for loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Comparing the Outputs
            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("The computations are not equal");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
