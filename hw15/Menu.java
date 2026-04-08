import java.util.Scanner;

public class Menu {

    public static double rectangleArea(double w, double h) {
        return w * h;
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Rectangle Area");
            System.out.println("2. Circle Area");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int x = input.nextInt();

            if (x == 1) {
                System.out.print("Enter width: ");
                double w = input.nextDouble();
                System.out.print("Enter height: ");
                double l = input.nextDouble();

                double area = rectangleArea(w, l);
                System.out.println("Rectangle area = " + area);
            } else if (x == 2) {
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();

                double area = circleArea(radius);
                System.out.println("Circle area = " + area);
            } else if (x == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid Menu Selection! Please make another selection.");
            }
        }

        input.close();
    }
}
