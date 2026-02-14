
    import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of passengers: ");
        int passengers = input.nextInt();

        int taxis = (int) Math.ceil(passengers / 4.0);

        System.out.println("Taxis needed: " + taxis);
    }
}

