import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        //  Printing Output
        System.out.println("Distance in feet  : " + distanceInFeet);
        System.out.println("Distance in yards : " + distanceInYards);
        System.out.println("Distance in miles : " + distanceInMiles);
    }
}
