import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Continue? Respond with y or n: ");
            answer = sc.nextLine();
        }
        while (!answer.equals("y") && !answer.equals("n"));

        System.out.println("You entered: " + answer);
    }
}