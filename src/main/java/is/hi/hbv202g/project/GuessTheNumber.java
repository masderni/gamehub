package is.hi.hbv202g.project;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    
    public static void guessTheNumber(Scanner scanner) {
        System.out.println("Starting Guess the Number...");
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low. Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again:");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);
    }
}
