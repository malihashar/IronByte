
    import java.util.Scanner;



public class Q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);

        System.out.print(a + " + " + b + " = ");
        int answer = input.nextInt();

        while (answer != a + b) {
            System.out.print("Try again: ");
            answer = input.nextInt();
        }

        System.out.println("Correct!");
    }
}

