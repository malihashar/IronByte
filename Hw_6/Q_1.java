import java.util.Scanner;


public class Q_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double b = input.nextDouble();

        System.out.print("Enter exponent: ");
        double e = input.nextDouble();

        double result = Math.pow(b, e);

        System.out.println("Result: " + result);
    }
}


