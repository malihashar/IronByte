import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        String[] parts = word.split(",");

        String last = parts[0].trim();
        String first = parts[1].trim();

        System.out.println("Hello " + first + " " + last);
    }
}
