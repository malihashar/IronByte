import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUM = 4;

        String[] names = new String[NUM];
        String[] marks = new String[NUM];

        for (int i = 0; i < NUM; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter mark for " + names[i] + ": ");
            marks[i] = input.nextLine();
        }

        System.out.print("Enter mark to search: ");
        String searchMark = input.nextLine();

        boolean found = false;
        for (int i = 0; i < NUM; i++) {
            if (marks[i].equals(searchMark)) {
                System.out.println("Student with mark " + searchMark + ": " + names[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        input.close();
    }
}
