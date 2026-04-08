import java.util.Scanner;

public class Message {

    public static String welcomeMessage(String name, int visitorNum) {
        return "Welcome " + name + "! You are visitor number " + visitorNum + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String x = input.nextLine();

        System.out.print("Enter visitor number: ");
        int y = input.nextInt();

        String result = welcomeMessage(x, y);
        System.out.println(result);

        input.close();
    }
}
