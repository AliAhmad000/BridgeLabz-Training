import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs in centimeters
        System.out.print("Enter base in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();

        // Area in square centimeters
        float areaSqCm = 0.5f * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 sq inch = (2.54 × 2.54) sq cm
        float areaSqIn = areaSqCm / (2.54f * 2.54f);

        // Output
        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm );
    }
}
