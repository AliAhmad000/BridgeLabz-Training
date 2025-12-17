import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        double base;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        height = input.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println(
            "The area of the triangle is " + areaInSqInches + " square inches and " + areaInSqCm + " square centimeters");
    }
}
