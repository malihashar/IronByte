import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = scanner.nextInt();

        int dig1 = num / 100;
        int dig2 = (num / 10) % 10;
        int dig3 = num % 10;

        int sum = dig1 + dig2 + dig3;

        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}
