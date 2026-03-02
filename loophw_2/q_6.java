import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        do {
            System.out.print("Enter an integer (negative to stop): ");
            num = sc.nextInt();

            if (num >= 0) {
                count++;
            }

        } while (num >= 0);

        System.out.println("Number of integers entered: " + count);
    }
}
