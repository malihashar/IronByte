import java.util.Scanner;

public class ptest1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Funland Amusement Park!");
        System.out.println("1. Check ticket price");
        System.out.println("2. Give example with randomly generated data");
        System.out.println("3. Display all ticket price information");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter your age: ");
                int age = input.nextInt();

                if (age <= 0) {
                    System.out.println("Error: Invalid age.");
                    break;
                }

                System.out.println("Choose a ride package:");
                System.out.println("1 - Basic Entry");
                System.out.println("2 - Thrill Rides");
                System.out.println("3 - All Access Pass");
                int packageChoice = input.nextInt();

                if (packageChoice < 1 || packageChoice > 3) {
                    System.out.println("Error: Invalid package choice.");
                    break;
                }

                calculateTicket(age, packageChoice);
                break;

            case 2:

                int randomAge = (int)(Math.random() * 80) + 5;
                int randomPackage = (int)(Math.random() * 3) + 1;

                System.out.println("Computer generated:");
                System.out.println("Age: " + randomAge);

                if (randomPackage == 1)
                    System.out.println("Ride Package: Basic Entry");
                else if (randomPackage == 2)
                    System.out.println("Ride Package: Thrill Rides");
                else
                    System.out.println("Ride Package: All Access Pass");

                calculateTicket(randomAge, randomPackage);
                break;

            case 3:

                System.out.println("--- Ticket Price Table ---");
                System.out.println("| 5 - 12 years | $12.00 |");
                System.out.println("| 13 - 59 years | $25.00 |");
                System.out.println("| 60+ years | $15.00 |");

                System.out.println("--- Ride Packages ---");
                System.out.println("| Basic Entry | $0.00 |");
                System.out.println("| Thrill Rides | $10.00 |");
                System.out.println("| All Access Pass | $20.00 |");

                System.out.println("Tax Rate: 13%");
                break;

            case 4:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Error: " + choice + " is not a valid option.");
                System.out.println("Goodbye!");
        }

        input.close();
    }

    public static void calculateTicket(int age, int packageChoice) {

        double basePrice = 0;
        double extraCost = 0;

        // Base price by age
        if (age >= 5 && age <= 12)
            basePrice = 12;
        else if (age >= 13 && age <= 59)
            basePrice = 25;
        else if (age >= 60)
            basePrice = 15;
        else {
            System.out.println("Error: Age must be 5 or older.");
            return;
        }

        // Package cost
        if (packageChoice == 1)
            extraCost = 0;
        else if (packageChoice == 2)
            extraCost = 10;
        else
            extraCost = 20;

        double totalBeforeTax = basePrice + extraCost;
        double tax = totalBeforeTax * 0.13;
        double finalPrice = totalBeforeTax + tax;

        System.out.printf("Base Ticket Price: $%.2f\n", basePrice);
        System.out.printf("Extra Ride Package Cost: $%.2f\n", extraCost);
        System.out.printf("Total Before Tax: $%.2f\n", totalBeforeTax);
        System.out.printf("Tax (13%%): $%.2f\n", tax);
        System.out.printf("Final Ticket Price: $%.2f\n", finalPrice);

        // 🎟 Golden Ticket (2% chance)
        int golden = (int)(Math.random() * 100) + 1;

        if (golden <= 2) {
            System.out.println("Congratulations! You have won a FREE Golden Ticket!");
            System.out.println("Your ticket price is now $0.00. Enjoy your visit!");
        }
    }
}