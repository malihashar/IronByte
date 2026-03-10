import java.util.Scanner;

public class NumberTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter y: ");
        int y = input.nextInt();

        for (int row = 1; row <= x; row++) {
            for (int col = 1; col <= y; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
