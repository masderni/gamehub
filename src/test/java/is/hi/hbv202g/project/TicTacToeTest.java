package is.hi.hbv202g.project;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {



    @Test
    public void testdrawfalse() {
        TicTacToe ticTacToe = new TicTacToe();
        char [][] board = {{'\0','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
        ticTacToe.setBoard(board);
        assertFalse(ticTacToe.checkDraw()); // bc the board needs to be full
        char [][] board2 = {{'X','0','X'},{'O','X','O'},{'X','O','X'}};
        ticTacToe.setBoard(board2);
        assertFalse(ticTacToe.checkDraw());
    }

    @Test
    public void testdrawtrue() {
        TicTacToe ticTacToe = new TicTacToe();
        char [][] board = {{'X','0','X'},{'X','O','X'},{'O','X','O'}};
        ticTacToe.setBoard(board);
        assertTrue(ticTacToe.checkDraw());
    }
}
