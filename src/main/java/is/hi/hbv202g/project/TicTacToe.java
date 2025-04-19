package is.hi.hbv202g.project;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    private char[][] board = new char[3][3];
    Scanner scanner = new Scanner(System.in);
    public void play(){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("please select a square from A-C row and 1-3 column");
        String input = scanner.nextLine();
        // check if input is valid
        if(input.length() != 2 || input.charAt(0) < 'A' || input.charAt(0) > 'C' || input.charAt(1) < '1' || input.charAt(1) > '3') {
            System.out.println("invalid input, please try again"); 
            play();
        }
        // check if square is already taken
        if(board[(int) (input.charAt(0)-'A')][(int) (input.charAt(1)-'1')] != '\0') {
            System.out.println("square already taken, please try again"); 
            play();
        }
        if(input.charAt(0) == 'A')board[0][(int) (input.charAt(1) - '1')] = 'X'; 
        else if(input.charAt(0) == 'B')board[1][(int) (input.charAt(1)-'1')] = 'X';
        else if(input.charAt(0) == 'C')board[2][(int) (input.charAt(1)-'1')] = 'X';
        printBoard();
        if(checkWin()){
            clearboard();
            System.out.println("You win!");
            playAgain();
        } 
        else if(checkDraw()){ // clearboard is in the checkdraw method
            playAgain();
        }
        System.out.println("It's the bots turn!");
        botPlay();
        play();
        
    }

    private void printBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
                if(board[i][j] == '\0') System.out.print(" ");//print a space to make the board look nice
            }
            System.out.println();
        }
    }

    private boolean checkWin(){
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] != '\0') return true; //line cases
        if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] != '\0') return true; //line cases
        if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] != '\0') return true; //line cases	
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] != '\0') return true; //column cases 
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] != '\0') return true; //column cases
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != '\0') return true; //column cases
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != '\0') return true; //diagonal cases
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != '\0') return true; //diagonal cases
        return false;
    }

    private boolean checkDraw(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '\0') return false;
            }
        }
        clearboard();
        return true;
    }

    // simple random number bot
    private void botPlay(){
        Random random = new Random();
        int row = random.nextInt(3);
        int col = random.nextInt(3);
        while(board[row][col] != '\0'){
            row = random.nextInt(3);
            col = random.nextInt(3);
        }
        board[row][col] = 'O';
        printBoard();
        if(checkWin()){
            clearboard();
            System.out.println("You lose!");
            playAgain();
        }
        else if(checkDraw()){
            System.out.println("Draw!");
            playAgain();
        }
    }
    // clears the board
    private void clearboard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '\0';
            }
        }
    }

    private void playAgain(){
        System.out.println("Would you like to play again? (y/n)");
        //Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.nextLine();
        if(playAgain.equals("y")) play();
        else System.exit(0);
    }
}   
