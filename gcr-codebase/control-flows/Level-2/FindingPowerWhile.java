import java.util.Scanner;

public class FindingPowerWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        // Calculate power using while loop
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Printing Output
        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}
