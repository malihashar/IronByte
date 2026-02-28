import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int secret;
        int guess = 0;

        secret = (int)(Math.random()*20) + 1;

        while(guess != secret){

            System.out.print("Guess number: ");
            guess = input.nextInt();

        }

        System.out.println("Correct!");

    }

}
