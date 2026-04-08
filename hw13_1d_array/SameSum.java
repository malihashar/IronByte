import java.util.Scanner;

public class SameSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valA = new int[10];
        int[] valB = new int[10];

        for (int i = 0; i < valA.length; i++) {
            System.out.print("Enter valA[" + i + "]: ");
            valA[i] = input.nextInt();
            valB[i] = 25 - valA[i];
        }

        System.out.println("valA:");
        for (int i = 0; i < valA.length; i++) {
            System.out.print(valA[i] + " ");
        }

        System.out.println("\nvalB:");
        for (int i = 0; i < valB.length; i++) {
            System.out.print(valB[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
