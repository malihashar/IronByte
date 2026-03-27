/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U
Date: March 12, 2026
Program: RandomWalkSimulation.java


*/

import java.util.Scanner;

public class RandomWalkSimulation {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int steps = input.nextInt();

        int x = 0;
        int y = 0;

        double maxDistance = 0;

        for(int i=0;i<steps;i++){

            int move = (int)(Math.random()*4);

            if(move == 0)
                y++;
            else if(move == 1)
                y--;
            else if(move == 2)
                x++;
            else
                x--;

            double distance = Math.sqrt(x*x + y*y);

            if(distance > maxDistance)
                maxDistance = distance;
        }

        double finalDistance = Math.sqrt(x*x + y*y);

        System.out.println("Steps simulated: " + steps);
        System.out.println("Final Position: (" + x + ", " + y + ")");
        System.out.printf("Distance from Origin: %.2f\n", finalDistance);
        System.out.printf("Maximum Distance Reached: %.2f\n", maxDistance);

        input.close();
    }
}