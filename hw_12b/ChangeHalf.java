import java.util.Scanner;

public class ChangeHalf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int mid = word.length() / 2;

        if (word.length() % 2 == 0) {
            String first = word.substring(0, mid);
            String second = word.substring(mid);
            System.out.println(second + first);
        } else {
            String first = word.substring(0, mid);
            String middle = word.substring(mid, mid + 1);
            String second = word.substring(mid + 1);
            System.out.println(second + middle + first);
        }
    }
}
