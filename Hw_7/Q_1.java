import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 10;

        int num1 = (int)(Math.random() * (max - min + 1) + min);
        int num2 = (int)(Math.random() * (max - min + 1) + min);

        int ans = num1 + num2;

        System.out.println("What is " + num1 + " + " + num2 + "?");
        int res = scanner.nextInt();

        if (res == ans) {
            System.out.println("Hooray! Correct.");
        } else {
            System.out.println("Incorrect, try again.");
            System.out.println("What is " + num1 + " + " + num2 + "?");
            res = scanner.nextInt();
        }
    }
}
