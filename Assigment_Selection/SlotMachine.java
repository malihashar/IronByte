/*
Name: Muhammad Hashar
Date: February 26, 2026
Teacher: Ms. Xie
Assignment: Selection - (SlotMachine.java)


*/

public class SlotMachine {

    public static void main(String[] args) {

        int num1 = (int)(Math.random()*3) + 1;
        int num2 = (int)(Math.random()*3) + 1;
        int num3 = (int)(Math.random()*3) + 1;

        int tokens = 0;
        // Tells the user the tokens before checking
        System.out.println("You got " + num1 + " " + num2 + " " + num3);

        // check winning conditions when numbers are the same
        if(num1==1 && num2==1 && num3==1){
            tokens = 4;
        }
        else if(num1==2 && num2==2 && num3==2){
            tokens = 8;
        }
        else if(num1==3 && num2==3 && num3==3){
            tokens = 12;
        }
        // check winning conditions when 2 numbers are the same
        else if(num1==num2 || num1==num3 || num2==num3){
            tokens = 1;
        }
        else{
            tokens = 0;
        }

        System.out.println("You won " + tokens + " tokens");

    }
}