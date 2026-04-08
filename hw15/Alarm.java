import java.util.Scanner;

public class Alarm {

    public static void printAlarm(int num) {
        if (num < 1) {
            System.out.println("Error: number must be at least 1.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Alarm!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        printAlarm(x);

        input.close();
    }
}
