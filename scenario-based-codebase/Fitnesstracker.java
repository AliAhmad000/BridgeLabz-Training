import java.util.Scanner;

public class Fitnesstracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pushUps = new int[7];

        System.out.println(" Sandeep’s Fitness Challenge Tracker");
        System.out.println("Enter push-ups for 7 days (0 for rest day):");

        // Taking input
        for (int i = 0; i < pushUps.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }

        int totalPushUps = 0;
        int activeDays = 0;

        // for-each loop
        for (int dailyCount : pushUps) {

            // Skip rest days
            if (dailyCount == 0) {
                continue;
            }

            totalPushUps += dailyCount;
            activeDays++;
        }

        double average = (activeDays > 0)
                ? (double) totalPushUps / activeDays
                : 0;

        System.out.println("\n Weekly Summary");
        System.out.println("Total Push-ups (excluding rest days): " + totalPushUps);
        System.out.println("Average Push-ups per active day: " + average);

    }
}
