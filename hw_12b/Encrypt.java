import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line to be encrypted: ");
        String word = input.nextLine();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == ' ') {
                result += " ";
            } else {
                int start = i;

                while (i < word.length() && word.charAt(i) != ' ') {
                    i++;
                }
                int end = i - 1;

                if (end - start < 2) {
                    for (int j = start; j <= end; j++) {
                        result += word.charAt(j);
                    }
                } else {
                    result += word.charAt(end);

                    for (int j = start + 1; j < end; j++) {
                        result += (char)(word.charAt(j) + 2);
                    }

                    result += word.charAt(start);
                }

                i--;
            }
        }

        System.out.println("The encryption is: " + result);
    }
}
