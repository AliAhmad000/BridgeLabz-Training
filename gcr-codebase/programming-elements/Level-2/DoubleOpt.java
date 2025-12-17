import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Double operations (operator 
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Printing Output
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " +
            result2 + ", " +
            result3 + ", and " +
            result4 );
    }
}
