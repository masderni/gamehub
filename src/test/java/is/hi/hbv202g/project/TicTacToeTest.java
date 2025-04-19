package is.hi.hbv202g.project;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    private TicTacToe ticTacToe;
    
    @Before
    public void setUp() {
        TicTacToe ticTacToe = new TicTacToe();
    }

    @Test
    public void testdraw() {
    
        ticTacToe.board[0][0] = 'X';
        ticTacToe.board[0][1] = 'O';
        ticTacToe.board[0][2] = 'X';
        ticTacToe.board[1][0] = 'O';
        ticTacToe.board[1][1] = 'X';
        ticTacToe.board[1][2] = 'O';
        ticTacToe.board[2][0] = 'X';
        ticTacToe.board[2][1] = 'O';
        ticTacToe.board[2][2] = 'X';
        System.out.println(ticTacToe.checkDraw());
    }
}
