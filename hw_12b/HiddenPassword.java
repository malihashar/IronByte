import java.util.Scanner;

public class HiddenPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        System.out.print("Enter a character: ");
        char hide = input.next().charAt(0);

        String password = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                password += " ";
            } else {
                password += hide;
            }
        }

        System.out.println("Hidden Password: " + password);
    }
}
