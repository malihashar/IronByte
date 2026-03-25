import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        System.out.println("First 4 letters are: " + word.substring(0, 4));
        System.out.println("Last 4 letters are: " + word.substring(word.length() - 4, word.length()));
    }
}
