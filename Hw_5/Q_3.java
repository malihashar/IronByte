import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args){
    final double can= 1.36;

    Scanner scanner= new Scanner(System.in);
    System.out.print("enter you us dollar amount for Canadian conversion:");
    Double us= scanner.nextDouble();
    double total= us*can;
    System.out. println("your total in cnadian dollars is:"+total);

    } 
    
}
