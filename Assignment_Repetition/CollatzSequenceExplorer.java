/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U
Date: March 12, 2026
Program: CollatzSequenceExplorer.java


*/

import java.util.Scanner;

public class CollatzSequenceExplorer {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int n = input.nextInt();

        int steps = 0;
        int largest = n;

        System.out.println("Sequence:");
        System.out.print(n);

        // repeat until 1
        while(n != 1){

            if(n % 2 == 0)
                n = n/2;
            else
                n = 3*n + 1;

            System.out.print(" -> " + n);

            if(n > largest)
                largest = n;

            steps++;
        }

        System.out.println();
        System.out.println("Steps: " + steps);
        System.out.println("Largest value reached: " + largest);

        input.close();
    }
}