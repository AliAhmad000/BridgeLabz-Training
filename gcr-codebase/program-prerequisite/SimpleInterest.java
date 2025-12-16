import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int rate = sc.nextInt();

        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();

        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);

    }
}
