import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = input.nextLine();

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(str.substring(i, i + 1));
            total += digit;
        }

        System.out.println("Sum of digits: " + total);
    }
}
