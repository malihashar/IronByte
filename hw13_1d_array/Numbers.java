import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[6];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            num[i] = input.nextDouble();
        }

        System.out.println("Reverse order:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + (num[i] * 0.10);
        }

        System.out.println("Values >= 50 after +10%:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 50) {
                System.out.println(num[i]);
            }
        }

        input.close();
    }
}
