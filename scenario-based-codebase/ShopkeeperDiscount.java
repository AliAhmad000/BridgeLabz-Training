import java.util.Scanner;
 
public class ShopkeeperDiscount {

    public static void main(String[] args) {

        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_05 = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double totalAmount = 0;

        // Input item prices
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            totalAmount += sc.nextDouble();
        }

        double discount;
        double finalAmount;

        // Discount logic
        if (totalAmount >= 5000) {
            discount = totalAmount * DISCOUNT_10;
        } else if (totalAmount >= 3000) {
            discount = totalAmount * DISCOUNT_05;
        } else {
            discount = 0;
        }

        finalAmount = totalAmount - discount;

        System.out.println("\nTotal Amount: " + totalAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + finalAmount);
    }
}