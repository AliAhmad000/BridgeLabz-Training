import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();   // taking input from user

        miles = km / 1.6;       // conversion formula

        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km" );

    }
}
