import java.util.Scanner;

public class Backward2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 50 and 100: ");
        int stopNumber = input.nextInt();

        while (stopNumber < 50 || stopNumber > 100) {
            System.out.print("Please enter a number BETWEEN 50 and 100: ");
            stopNumber = input.nextInt();
        }

        for (int i = 100; i >= 5; i -= 5) {
            if (i < stopNumber) {
                break;
            }
            System.out.println(i);
        }

        input.close();
    }
}
