import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valA = new int[10];
        int[] valB = new int[10];

        for (int i = 0; i < valA.length; i++) {
            System.out.print("Enter valA[" + i + "]: ");
            valA[i] = input.nextInt();
        }

        for (int i = 0; i < valA.length; i++) {
            valB[i] = valA[valA.length - 1 - i];
        }

        System.out.println("valB (reversed):");
        for (int i = 0; i < valB.length; i++) {
            System.out.print(valB[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
