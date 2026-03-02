import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        do {
            System.out.print("Enter an integer (-1 to stop): ");
            num = sc.nextInt();

            if (num != -1) {
                count++;
            }

        } while (num != -1);

        System.out.println("Number of integers entered: " + count);
    }
}