package is.hi.hbv202g.project;

import org.junit.Test;
import static org.junit.Assert.*;


public class GuessTheNumberTest {
    
    @Test
    public void test() {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        GuessTheNumber.guessTheNumber(null);//if i had more time i would have implemented guess the number better
        assertEquals(3, guessTheNumber.getGuess());    
    }
}
