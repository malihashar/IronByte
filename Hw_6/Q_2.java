 import java.util.Scanner;

public class Q_2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        double result = Math.abs(num);

        System.out.println("Absolute value: " + result);
    }
}


