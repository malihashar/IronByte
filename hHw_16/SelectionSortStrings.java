import java.util.Scanner;

public class SelectionSortStrings {

    public static void input10StringsAndSelectionSort() {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[10];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < words.length; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < words.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < words.length; j++) {
                if (words[j].compareToIgnoreCase(words[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = words[i];
            words[i] = words[minIndex];
            words[minIndex] = temp;
        }

        System.out.println("\nSorted list:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        input10StringsAndSelectionSort();
    }
}
