import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] height = new double[20];
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            sum += height[i];
        }

        double average = sum / 20;
        System.out.println("Average height: " + average);
        System.out.println("Heights above average:");

        for (int i = 0; i < 20; i++) {
            if (height[i] > average) {
                System.out.println(height[i]);
            }
        }

        input.close();
    }
}
