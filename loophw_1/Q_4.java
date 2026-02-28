import java.util.Scanner;

public class Q_4 {




    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter a: ");
        a = input.nextInt();

        System.out.print("Enter b: ");
        b = input.nextInt();

        while(a <= b){
            System.out.println(a);
            a = a + 1;
        }

    }

}

