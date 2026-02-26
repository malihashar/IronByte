import java.util.Scanner;

/*
Name: Muhammad Hashar
Date: February 26, 2026
Teacher: Ms. Xie
Assignment: Selection - (Point.java)

Checks if a point is between two arcs (positive)
*/

public class Point {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radi1;
        double radi2;
        double x;
        double y;

        System.out.print("Enter the two radii: ");
        radi1 = scanner.nextDouble();
        radi2 = scanner.nextDouble();

        System.out.print("Enter the X coordinate of the point: ");
        x = scanner.nextDouble();

        System.out.print("Enter the Y coordinate of the point: ");
        y = scanner.nextDouble();


        double dradi1 = Math.sqrt(Math.pow(radi1,2)); // distance of radius 1
        double dradi2 = Math.sqrt(Math.pow(radi2,2)); // distance of radius 2
        double dxy = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); // distance from origin


        double small;
        double big;

        // find smaller and bigger radius
        if(dradi1 < dradi2){
            small = dradi1;
            big = dradi2;
        }
        else{
            small = dradi2;
            big = dradi1;
        }


        // the points must be positive 
        if(x < 0 || y < 0){
            System.out.println("Your point (" + x + ", " + y + ") does not lie in the region.");
        }

        // distance must be bigger than the smaller radius and smaller than the bigger radius
        else if(dxy >= small && dxy <= big){
            System.out.println("Your point (" + x + ", " + y + ") lies in the region.");
        }
        // or else the point doesnt lie
        else{
            System.out.println("Your point (" + x + ", " + y + ") does not lie in the region.");
        }

    }

}