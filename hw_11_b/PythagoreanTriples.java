import java.util.Scanner;

public class PythagoreanTriples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int limit = input.nextInt();

        while (limit <= 0) {
            System.out.print("Please enter a POSITIVE integer: ");
            limit = input.nextInt();
        }

        System.out.println("Pythagorean triples with largest number <= " + limit + ":");

        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                for (int c = b + 1; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }

        input.close();
    }
}
