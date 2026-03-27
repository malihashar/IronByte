/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U
Date: March 12, 2026
Program: PrimeNumberAnalyzer.java


*/

import java.util.Scanner;

public class PrimeNumberAnalyzer {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int count = 0;
        int sum = 0;
        int largest = 0;

        System.out.print("Prime Numbers: ");

        // check numbers from 2 to N
        for(int i=2;i<=n;i++){

            boolean prime = true;

            // check divisibility
            for(int j=2;j<i;j++){

                if(i % j == 0){
                    prime = false;
                    break;
                }
            }

            // if prime update statistics
            if(prime){

                System.out.print(i + " ");
                count++;
                sum += i;
                largest = i;
            }
        }

        double average = (double)sum/count;

        System.out.println();
        System.out.println("Total Primes: " + count);
        System.out.println("Largest Prime: " + largest);
        System.out.printf("Average: %.2f\n", average);

        input.close();
    }
}