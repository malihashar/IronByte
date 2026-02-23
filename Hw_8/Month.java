import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int days = 0;

        System.out.print("Enter the month number (1-12): ");
        int option = input.nextInt();

        switch(option) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.println("There are " + days + " days in that month.");
    }
}