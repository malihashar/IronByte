import java.util.Scanner;

public class AddPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = input.nextLine();

        int total = 0;

        for (int i = 0; i < str.length(); i += 2) {

            if (i + 1 < str.length()) {
                int num = Integer.parseInt(str.substring(i, i + 2));
                total += num;
            } else {
                int num = Integer.parseInt(str.substring(i, i + 1));
                total += num;
            }
        }

        System.out.println("Sum of pairs: " + total);
    }
}
