import java.util.Scanner;

public class AddUnicodes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i);
        }

        System.out.println("Sum of the Unicodes = " + sum);
    }
}
