package is.hi.hbv202g.project;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    Scanner scanner = new Scanner(System.in);
    private String userMove;

    public void rockPaperScissors() {
        String[] rps = {"rock", "paper", "scissors"};
        Random rand = new Random();

        System.out.print("Enter rock, paper, or scissors: ");
        userMove = scanner.nextLine().toLowerCase();
        String computerMove = rps[rand.nextInt(3)];

        System.out.println("Computer chose: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                   (userMove.equals("paper") && computerMove.equals("rock")) ||
                   (userMove.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("You win!");
        } else if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {
            System.out.println("You lose!");
        } else {
            System.out.println("Invalid move. Please restart and try again.");
            rockPaperScissors();
        }
        playAgain();

    }
    private void playAgain() {
        System.out.println("Would you like to play again? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("y")) {
            rockPaperScissors();
        }
        else if(!playAgain.equals("n")) {
            System.out.println("Invalid input. Please try again.");
            playAgain();
        }
    }

    public void setUserMoveString(String newuserMove) {
        userMove = newuserMove;
    }

    public String getUserMoveString() {
        return userMove;
    }
}
