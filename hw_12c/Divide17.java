import java.util.Scanner;

public class Divide17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        String combined = String.valueOf(num1) + String.valueOf(num2);

        int newNum = Integer.parseInt(combined);

        double result = newNum / 17.0;

        System.out.printf("Result: %.2f", result);
    }
}
