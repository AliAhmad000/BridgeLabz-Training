import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement counter
        }

        System.out.println("Launch Successful!");
    }
}
