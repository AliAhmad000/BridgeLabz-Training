import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter unit price (INR): ");
        float unitPrice = sc.nextFloat();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculating total price
        float totalPrice = unitPrice * quantity;

        // Printing Output
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice );
    }
}
