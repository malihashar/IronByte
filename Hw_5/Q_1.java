import java.util.Scanner;

public class Q_1 {
    public static void main ( String[] args) {
        Scanner scanner =new Scanner(System.in);
        final double HST=0.13;

    
    System.out.print("Enter the price of your item:");
    Double price= scanner.nextDouble();

    Double tax= price*HST;
    System.out.println("The tax is " + tax);

    Double finalPrice= tax +price;
    System.out.println("The final price is " + finalPrice);

    }
}
