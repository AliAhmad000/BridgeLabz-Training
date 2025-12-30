/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 50;   // total parking slots available
        int occupied = 0;   // currently occupied slots
        int choice;

        while (occupied < capacity) {

            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking lot is full!");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting system. Thank you, for using our system");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (occupied == capacity) {
                System.out.println("\nParking lot is FULL. No more vehicles can be parked.");
            }
        }
    }
}
