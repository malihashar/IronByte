import java.util.Scanner;

public class Question_3 {
    public static void main ( String[] args){
        String first;
        String second;
        Scanner input= new Scanner( System.in);
        System.out.print("Enter yoru first word:");
        first= input.nextLine();
        System.out.print("Enter your second word:");
        second= input.nextLine();
        System.out.println(first);
        System.out.println(second);
        System.out.println(first +""+ second);

    }
}
