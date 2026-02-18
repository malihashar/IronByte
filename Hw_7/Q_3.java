import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.print(number + " is ");

        
        if (number > 0) {
            System.out.print("positive");
        } else if (number < 0) {
            System.out.print("negative");
        } else {
            System.out.print("zero");
        }

        
        if (number % 2 == 0) {
            System.out.print(", even");
        }

        
        if (number % 7 == 0) {
            System.out.print(", multiple of 7");
        }

        System.out.println(".");
    }
}
