import java.util.Scanner;

public class MeanHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating double array
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking input
        System.out.println("Enter the heights of the football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
        }

        // Calculating sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculating mean
        double mean = sum / heights.length;

        // Displaying mean height
        System.out.println("\nMean height of the football team is: " + mean);
    }
}
