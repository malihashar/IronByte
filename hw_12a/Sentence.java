import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        System.out.println("You have entered " + word);
        System.out.println("The length is: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());

        System.out.println("Letters from 3 to 6: " + word.substring(2, 6));
        System.out.println("Letters from 3 to the end: " + word.substring(2));

        System.out.println("Trimmed: " + word.trim());

        System.out.println("All i replaced: " + word.replace("i", "xx"));
        System.out.println("First cr replaced: " + word.replaceFirst("cr", "aa"));
    }
}
