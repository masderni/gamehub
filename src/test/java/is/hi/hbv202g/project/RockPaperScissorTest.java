package is.hi.hbv202g.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class RockPaperScissorTest {

    @Test
    public void testString() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.setUserMoveString("Rock");
        String player1 = rockPaperScissors.getUserMoveString();
        assertEquals("Rock", player1);
    }
    
}
