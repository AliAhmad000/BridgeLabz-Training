import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility
        boolean result = (number % 5 == 0);

        // Printing Output
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
