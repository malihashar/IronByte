import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sales;
        double total = 1000;

        System.out.print("Enter number of sales: ");
        sales = input.nextInt();

        if(sales > 10){
            total = total + total * sales / 100;
        }

        System.out.println("Total salary = " + total);

    }

}