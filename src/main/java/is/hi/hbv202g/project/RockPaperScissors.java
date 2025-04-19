package is.hi.hbv202g.project;

public static void RockPaperScissors(Scanner scanner) {
        System.out.println("Starting Rock-Paper-Scissors...");
        String[] rps = {"rock", "paper", "scissors"};
        Random rand = new Random();

        System.out.print("Enter rock, paper, or scissors: ");
        String userMove = scanner.nextLine().toLowerCase();
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
        }
    }
