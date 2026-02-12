import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        final double LABOUR = 0.75;
        final double RENT = 1.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the diameter of the pizza(in inches):");
        double diameter = scanner.nextDouble();

        double materials = 0.05 * diameter * diameter;
        double total = LABOUR + RENT + materials;

        System.out.printf("The cost of your pizza is $%.2f\n", total);
    }
}
