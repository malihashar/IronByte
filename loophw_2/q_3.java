import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.print("Enter a positive number (negative to stop): ");
            num = sc.nextInt();

            if (num >= 0) {
                sum += num;
            }

        } while (num >= 0);

        System.out.println("Sum = " + sum);
    }
}