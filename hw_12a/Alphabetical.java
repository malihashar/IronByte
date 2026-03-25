import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println(str1 + " is first");
        } else if (result > 0) {
            System.out.println(str2 + " is first");
        } else {
            System.out.println("They are equal");
        }
    }
}
