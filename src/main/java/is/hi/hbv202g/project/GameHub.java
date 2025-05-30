package is.hi.hbv202g.project;

import java.util.Scanner;


public class GameHub {

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Game Hub!");
        System.out.println("Choose a game to play:");
        System.out.println("1. Tic-Tac-Toe");
        System.out.println("2. Guess the Number");
        System.out.println("3. Rock-Paper-Scissors");
        System.out.print("Enter the number of the game: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                playTicTacToe(scanner);
                break;
            case "2":
                playGuessTheNumber(scanner);
                break;
            case "3":
                playRockPaperScissors(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please restart and choose a valid game.");
        }

        //scanner.close();

            // ------------------ Game Implementations ------------------
    }
    public static void playTicTacToe(Scanner scanner) {
        System.out.println("Starting Tic-Tac-Toe...");
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
        playAgain(scanner);

        //System.out.println("This is a placeholder. Tic-Tac-Toe is under development.");
    }

    public static void playGuessTheNumber(Scanner scanner) {
        System.out.println("Starting Guess the Number...");
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guessTheNumber();
        playAgain(scanner);

        //System.out.println("This is a placeholder. Guess the Number is under development.");
    }

    public static void playRockPaperScissors(Scanner scanner) {
        System.out.println("Starting Rock-Paper-Scissors...");
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.rockPaperScissors();
        playAgain(scanner);
        
        //System.out.println("This is a placeholder. Rock-Paper-Scissors is under development.");
    }

    public static void playAgain(Scanner scanner) {
        System.out.println("Would you like to play another game? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("y")) {
            main(null);
        } else {
            System.exit(0);
        }
    }
}

