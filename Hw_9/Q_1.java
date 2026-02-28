import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter age: ");
        age = input.nextInt();

        if(age >= 18){
            System.out.println("OLD ENOUGH TO VOTE");
        }
        else{
            System.out.println(18-age + " years before voting is possible");
        }

    }

}