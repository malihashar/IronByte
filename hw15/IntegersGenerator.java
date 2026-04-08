import java.util.Random;
import java.util.Scanner;

public class IntegersGenerator {

    public static int generateInt(int min, int max) {
        if (min > max) {
            System.out.println("First number should be smaller than second");
            return 0;
        }

        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = input.nextInt();

        System.out.print("Enter second number: ");
        int input2 = input.nextInt();

        int result = generateInt(input1, input2);
        System.out.println("Generated integer: " + result);

        input.close();
    }
}
