import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n (array size): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }

        System.out.println("Enter " + n + " integers to replace the 1s:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Even numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        input.close();
    }
}
