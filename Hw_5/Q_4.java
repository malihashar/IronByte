import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args){
       Scanner scanner= new Scanner(System.in);
       System.out.println("Enter in 5 grades for your average");
    System.out.println("Enter in your first grade:");
    int g1= scanner.nextInt();
    System.out.print("Enter in your second grade:");
    int g2= scanner.nextInt();
    System.out.print("Enter in your third grade:");
    int g3= scanner.nextInt();
    System.out.print("Enter in your fourth grade:");
    int g4= scanner.nextInt();
    System.out.print("Enter in your fifth grade:");
    int g5= scanner.nextInt();

    int total= g1+g2+g3+g4+g5;
    int average= (total/5);
    System.out.println("Your average is:"+average);

    }
    
}
