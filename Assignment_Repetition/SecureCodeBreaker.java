/*
Name: Muhammad Ali Hashar
Teacher: Ms. Xie
Course: ICS3U7
Date: March 12, 2026
Program: SecureCodeBreaker.java

*/

import java.util.Scanner;

public class SecureCodeBreaker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables for timing the game
        long startTime = 0L;
        long endTime = 0L;
        int duration = 0;

        // generate random 4-digit secret code
        int secretCode = (int)(Math.random()*9000) + 1000;

        int guess = 0;
        int totalGuesses = 0;

        System.out.println("=== Secure Code Breaker ===");
        System.out.println("Try to guess the secret 4-digit code!");

        // start timer (as shown in teacher demo)
        startTime = System.currentTimeMillis();

        // keep looping until the user guesses the code
        while(guess != secretCode) {

            System.out.print("Enter your 4-digit guess: ");
            guess = input.nextInt();

            totalGuesses++;

            // convert numbers to strings so we can compare digits
            String secret = Integer.toString(secretCode);
            String userGuess = Integer.toString(guess);

            int correctPosition = 0;
            int correctDigit = 0;

            // check each digit
            for(int i = 0; i < 4; i++) {

                // correct digit and correct position
                if(userGuess.charAt(i) == secret.charAt(i)) {
                    correctPosition++;
                }

                // correct digit but wrong position
                else if(secret.indexOf(userGuess.charAt(i)) != -1) {
                    correctDigit++;
                }
            }

            // show feedback after each guess
            System.out.println("Correct digit & position: " + correctPosition);
            System.out.println("Correct digit but wrong position: " + correctDigit);
            System.out.println();
        }

        // stop timer
        endTime = System.currentTimeMillis();

        // calculate duration in seconds
        duration = (int)(endTime - startTime)/1000;

        // game finished
        System.out.println("You cracked the code!");
        System.out.println("Total guesses: " + totalGuesses);
        System.out.println("Time taken: " + duration + " seconds");

        // determine rating
        if(totalGuesses >= 1 && totalGuesses <= 5)
            System.out.println("Rating: Code Master");

        else if(totalGuesses <= 10)
            System.out.println("Rating: Skilled Hacker");

        else
            System.out.println("Rating: Beginner");

        input.close();
    }
}