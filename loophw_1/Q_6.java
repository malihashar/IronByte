
import java.util.Scanner;
public class Q_6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int age = 16;
        int guess = 0;

        while(guess != age){

            System.out.print("Guess my age: ");
            guess = input.nextInt();

        }

        System.out.println("Correct!");

    }

}

