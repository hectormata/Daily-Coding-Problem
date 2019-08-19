package Facebook.Test.ProblemTest_27;

import Facebook.Main.Problem_27.Problem_27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest_27 {

    @Test
    public void checkBalanced1() {

        String given = "([])[]({})";
        boolean actual = Problem_27.isBalanced(given);

        assertTrue(actual);

    }

    @Test
    public void checkBalanced2() {

        String given2 = "([)]";
        boolean actual = Problem_27.isBalanced(given2);

        assertFalse(actual);
    }

    @Test
    public void checkBalanced3() {

        String given3 = "((()";
        boolean actual = Problem_27.isBalanced(given3);

        assertFalse(actual);
    }
}
