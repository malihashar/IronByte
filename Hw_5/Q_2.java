

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
    final double CM=2.57;
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter inches:");
    double inch= scanner.nextDouble();
    double total= (CM*inch);

    System.out.println("Your inches in cm is:"+ total);

    }
    
}
