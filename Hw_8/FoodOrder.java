import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.println("Select a breakfast option:");
        System.out.println("1. juice, muffin, coffee");
        System.out.println("2. cereal, toast, milk");
        System.out.println("3. egg, toast, coffee");
        System.out.println("4. banana, granola, milk");
        System.out.println("5. grapefruit, bacon, eggs, coffee");
        System.out.println("Your Option:");
        int option = input.nextInt();

        switch(option) {
            case 1:
                total = 9.50;
                break;
            case 2:
                total = 9.50;
                break;
            case 3:
                total = 10.00;
                break;
            case 4:
                total = 12.50;
                break;
            case 5:
                total = 14.00;
                break;
            default:
                System.out.println("You did not select an appropriate number.");
                return;  // stops program
        }

        System.out.println("Total cost: $" + total);
    }
}