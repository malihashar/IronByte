import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your letter grade (A, B, C, D, F): ");
        String option = input.next().toUpperCase();

        switch(option) {
            case "A":
                System.out.println("Good job, keep it up!");
                break;
            case "B":
                System.out.println("Nice, you're almost at an A!");
                break;
            case "C":
                System.out.println("Not bad, keep on studying.");
                break;
            case "D":
                System.out.println("You're close to failing, but don't worry — improve your study habits.");
                break;
            case "F":
                System.out.println("Oh no, you failed. Meet your teacher and make a plan to improve.");
                break;
            default:
                System.out.println("Invalid letter grade.");
        }
    }
}