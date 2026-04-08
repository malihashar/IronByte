import java.util.Scanner;

public class Month {

    public static String findMonth(int num) {
        switch (num) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month number";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int x = input.nextInt();

        String result = findMonth(x);
        System.out.println(result);

        input.close();
    }
}
