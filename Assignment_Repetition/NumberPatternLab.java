/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U
Date: March 12, 2026
Program: NumberPatternLab.java


*/

import java.util.Scanner;

public class NumberPatternLab {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size n: ");
        int n = input.nextInt();

        // Pattern 1
        System.out.println("\nPattern 1 – Centered Pyramid");

        for(int row=1; row<=n; row++){

            for(int s=1; s<=n-row; s++)
                System.out.print(" ");

            for(int i=1; i<=2*row-1; i++)
                System.out.print(i);

            System.out.println();
        }

        // Pattern 2
        System.out.println("\nPattern 2 – Inverted Pyramid");

        for(int row=n; row>=1; row--){

            for(int s=1; s<=n-row; s++)
                System.out.print(" ");

            for(int i=1; i<=2*row-1; i++)
                System.out.print(i);

            System.out.println();
        }

        // Pattern 3
        System.out.println("\nPattern 3 – Multiplication Triangle");

        for(int row=1; row<=n; row++){

            for(int col=1; col<=row; col++)
                System.out.print(row*col + " ");

            System.out.println();
        }

        // Pattern 4
        System.out.println("\nPattern 4 – Pascal's Triangle");

        for(int row=0; row<n; row++){

            int num = 1;

            for(int s=1; s<=n-row; s++)
                System.out.print(" ");

            for(int col=0; col<=row; col++){

                System.out.print(num + " ");
                num = num*(row-col)/(col+1);
            }

            System.out.println();
        }

        input.close();
    }
}