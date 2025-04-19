package is.hi.hbv202g.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuessTheNumberTest {
    
    @Test
    public void testInt() {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.setGuess(1);
        int guess = guessTheNumber.getGuess();
        assertEquals(1, guess);
    }
}
