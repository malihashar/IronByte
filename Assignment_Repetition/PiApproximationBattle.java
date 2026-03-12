/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U
Date: March 12, 2026
Program: PiApproximationBattle.java

Description:
Compares two methods of estimating PI:
1) Leibniz Series
2) Monte Carlo Simulation
*/

import java.util.Scanner;

public class PiApproximationBattle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of iterations: ");
        int iterations = input.nextInt();

        // Leibniz method
        double piLeibniz = 0;

        for(int i=0;i<iterations;i++){

            double term = 1.0/(2*i+1);

            if(i%2==0)
                piLeibniz += term;
            else
                piLeibniz -= term;
        }

        piLeibniz *= 4;

        // Monte Carlo method
        int inside = 0;

        for(int i=0;i<iterations;i++){

            double x = Math.random()*2 - 1;
            double y = Math.random()*2 - 1;

            if(x*x + y*y <= 1)
                inside++;
        }

        double piMonte = 4.0 * inside / iterations;

        double actual = Math.PI;

        double errorL = Math.abs(actual - piLeibniz);
        double errorM = Math.abs(actual - piMonte);

        System.out.printf("Leibniz Approximation: %.5f\n", piLeibniz);
        System.out.printf("Monte Carlo Approximation: %.5f\n", piMonte);
        System.out.printf("Actual PI: %.5f\n", actual);

        System.out.printf("Error (Leibniz): %.5f\n", errorL);
        System.out.printf("Error (Monte Carlo): %.5f\n", errorM);

        if(errorL < errorM)
            System.out.println("Better Method: Leibniz");
        else
            System.out.println("Better Method: Monte Carlo");

        input.close();
    }
}