import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String word = input.nextLine();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = java.lang.Character.toLowerCase(word.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("The number of vowels is " + count);
    }
}
