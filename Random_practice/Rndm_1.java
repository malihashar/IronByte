import java.util.Scanner;

public class Rndm_1 {
    public static void main(String[] args) {
        int ammount=0;
        String item="";
        double price=0.0;
        double total=0.0;
        Scanner scanner = new Scanner( System.in);
        System.out.print( "What item do you want to buy:");
        item= scanner.nextLine();
        System.out.print("What is the price of the item:");
        price = scanner.nextDouble();
        System.out.print("How many do you want to buy:");
        ammount= scanner.nextInt();
        total=price*ammount;
        System.out.println("you bought"+ ""  + ammount +" "+ item+"s"+ "" + "for"+ "" + "$" + total);
    
}
} 
