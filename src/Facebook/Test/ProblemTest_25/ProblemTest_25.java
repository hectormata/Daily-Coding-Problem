package Facebook.Test.ProblemTest_25;

import org.junit.jupiter.api.Test;

import static Facebook.Main.Problem_25.Problem_25.strmatch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_25 {

    @Test
    public void checkWildcard() {

        String str = "baaabab";
        String pattern = "*****ba*****ab";

        boolean expected = true;
        boolean actual = strmatch(str, pattern, str.length(), pattern.length());

        assertEquals(expected, actual);
    }

    @Test
    public void checkOtherPatterns() {

        String str = "baaabab";
        String pattern = "ba*****ab";
        // String pattern = "ba*ab";
        // String pattern = "a*ab";
        // String pattern = "a*****ab";
        // String pattern = "*a*****ab";
        // String pattern = "ba*ab****";
        // String pattern = "****";
        // String pattern = "*";
        // String pattern = "aa?ab";
        // String pattern = "b*b";
        // String pattern = "a*a";
        // String pattern = "baaabab";
        // String pattern = "?baaabab";
        // String pattern = "*baaaba*";

        boolean expected = true;
        boolean actual = strmatch(str, pattern, str.length(), pattern.length());

        assertEquals(expected, actual);
    }
}
