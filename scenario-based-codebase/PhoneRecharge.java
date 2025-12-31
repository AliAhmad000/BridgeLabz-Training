import java.util.Scanner;

public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        do {
            System.out.print("Enter Mobile Operator (Airtel / Jio / VI): ");
            String operator = sc.next();

            switch (operator.toLowerCase()) {

                case "airtel":
                    System.out.println(" Airtel Offer: 1GB extra data with unlimited messaging facility on your current plan at just Rs.:49 ");
                    break;

                case "jio":
                    System.out.println(" Jio Offer: Unlimited calls for 28 days + 1 day extra validity at just Rs.:269 ");
                    break;

                case "vi":
                    System.out.println(" VI Offer: Weekend data rollover and unlimited data around mid-night(12am - 6am)");
                    break;

                default:
                    System.out.println(" Invalid Operator! No offer applied.");
            }
            
            System.out.print("Enter Recharge Amount: Rs.");
            double amount = sc.nextDouble();

            balance += amount;
            
            System.out.println("Your recharge is successful.!!");
            System.out.println(" Current Balance: Rs." + balance);

            System.out.print("Do you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\n Thank you for using Phone Recharge Simulator!");
    }
}
