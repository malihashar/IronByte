import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;
        int power = 1;

        System.out.print("Enter number: ");
        number = input.nextInt();

        while(power < number){
            power = power * 2;
        }

        System.out.println(power);

    }

}

