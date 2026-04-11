import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter n (array size): ");
        int n = input.nextInt();

        int[] fib = new int[n];

        if (n >= 1) {
            fib[0] = a;
        }
        if (n >= 2) {
            fib[1] = b;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
