import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String result = "";

       
        result += word.substring(0, 1).toUpperCase();

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == ' ') {
                result += word.substring(i, i + 1).toUpperCase();
            } else {
                result += word.substring(i, i + 1).toLowerCase();
            }
        }

        System.out.println(result);
    }
}
