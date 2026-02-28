import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter age: ");
        age = input.nextInt();

        if(age < 18){
            System.out.println(age + " Too young to drive");
        }
        else if(age > 75){
            System.out.println(age + " Sorry you are over the legal age limit for driving");
        }
        else{
            System.out.println(age + " Age OK. Have you got a driver's licence?");
        }

    }

}