package Facebook.Test.ProblemTest_7;

import Facebook.Main.Problem_7.Problem_7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest7 {

    @Test
    public void decodeMsg() {

        char[] msg = {'1', '1', '1'};
        int size = msg.length;
        int expected = 3;

        assertEquals(expected, Problem_7.encodedMsg(msg, size));
    }
}
