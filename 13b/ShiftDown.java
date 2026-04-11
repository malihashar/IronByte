import java.util.Scanner;

public class ShiftDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int[] temp = new int[20];
        for (int i = 0; i < 20; i++) {
            int newIndex = i - 2;
            if (newIndex < 0) {
                newIndex = newIndex + 20;
            }
            temp[newIndex] = arr[i];
        }

        for (int i = 0; i < 20; i++) {
            arr[i] = temp[i];
        }

        System.out.println("After shift down by 2 (wrap around):");
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
