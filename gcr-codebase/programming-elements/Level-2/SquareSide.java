import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();

        // Calculating side
        float side = perimeter / 4;

        // Printing Output
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter );
    }
}
