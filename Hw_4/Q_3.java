import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ticketPrice = 64.97;

        System.out.print("Enter the amount of money you have: ");
        double money = scanner.nextDouble();

        int tickets = (int)(money / ticketPrice);
        double change = money - (tickets * ticketPrice);

        int dollars = (int)change;
        int cents = (int)((change - dollars) * 100);
        System.out.println("With " + money + " dollars you can buy " + tickets + " tickets.");
        System.out.println("The change is " + dollars + " dollars and " + cents + " cents.");
    }
}

