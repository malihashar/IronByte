import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);

        String str = String.valueOf(ch);

        System.out.println(ch);
        System.out.println(str);
    }
}
