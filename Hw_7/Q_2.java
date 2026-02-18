import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = 1234;
        int password = 5678;

        System.out.println("Enter your ID:");
        int verify1 = scanner.nextInt();

        System.out.println("Enter your password:");
        int verify2 = scanner.nextInt();

        if (verify1 == id && verify2 == password) {
            System.out.println("Access granted");
        } else {
            System.out.println("Incorrect, please try again.");

            System.out.println("Verify your ID:");
            verify1 = scanner.nextInt();

            System.out.println("Verify your password:");
            verify2 = scanner.nextInt();

            if (verify1 == id && verify2 == password) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        }
    }
}
