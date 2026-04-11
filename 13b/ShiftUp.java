import java.util.Scanner;

public class ShiftUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int last = arr[19];
        for (int i = 19; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("After shift up by 1 (last becomes first):");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
