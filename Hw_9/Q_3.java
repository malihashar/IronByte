import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int temp;

        System.out.print("Enter temperature: ");
        temp = input.nextInt();


        if(temp < -18)
            System.out.println("very cold");

        else if(temp < 0)
            System.out.println("cold");

        else if(temp == 0)
            System.out.println("freezing point of water");

        else if(temp <= 10)
            System.out.println("very cool");

        else if(temp <= 20)
            System.out.println("moderate");

        else if(temp <= 30)
            System.out.println("warm");

        else if(temp <= 40)
            System.out.println("hot");

        else if(temp <= 99)
            System.out.println("extremely hot");

        else if(temp == 100)
            System.out.println("boiling point of water");

    }

}