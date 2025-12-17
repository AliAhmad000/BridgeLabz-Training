import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        double heightCm;
        double totalInches;
        int feet;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        totalInches = heightCm / 2.54;   // convert cm to inches
        feet = (int) (totalInches / 12); // get feet

        System.out.println( "Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches );
    }
}
