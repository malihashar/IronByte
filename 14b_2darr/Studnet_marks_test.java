import java.util.Scanner;

public class Studnet_marks_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAXSTUDS = 5;
        final int MAXTESTS = 10;

        int[][] marks = new int[MAXSTUDS][MAXTESTS];

        for (int j = 0; j < MAXSTUDS; j++) {
            System.out.println("Marks of student " + j);
            for (int k = 0; k < MAXTESTS; k++) {
                System.out.print("Test # " + k + ": ");
                marks[j][k] = sc.nextInt();
            }
        }

        int great = 0;
        for (int i = 0; i < marks.length; i++) {
            int average = 0;
            for (int j = 0; j < marks[i].length; j++) {
                average += marks[i][j];
            }
            if (average >= great) {
                great = average;
            }
            System.out.println("Student " + i + " total marks: " + average);
        }

        System.out.println("Highest total (sum of all tests): " + great);

        sc.close();
    }
}
