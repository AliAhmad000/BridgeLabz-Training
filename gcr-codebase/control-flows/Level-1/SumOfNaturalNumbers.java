import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if natural number (0 or positive integer)
        if (n >= 0) {

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using while loop
            int loopSum = 0;
            int i = 1;

            while (i <= n) {
                loopSum = loopSum + i;
                i++;
            }

            // Printing outputs
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Comparing the outputs
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
