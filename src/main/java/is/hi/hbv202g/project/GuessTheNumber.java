package is.hi.hbv202g.project;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    Scanner scanner = new Scanner(System.in);
    private int guess;
    public void guessTheNumber() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        //int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        do {
            guess = scanner.nextInt();
            attempts++;
            if (guess > 100 || guess < 1) {
                System.out.println("You just wasted a guess. Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again:");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again:");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);
        playAgain();
    }

    private void playAgain() {
        System.out.println("Would you like to play again? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("y")) {
            guessTheNumber();
        } else if (!playAgain.equals("n")) {
            System.out.println("Invalid input. Please try again.");
            playAgain();
        }
    }

    public int getGuess() {
        return guess;
    }

    public int setGuess(int guess) {
        this.guess = guess;
        return guess;
    }

}
