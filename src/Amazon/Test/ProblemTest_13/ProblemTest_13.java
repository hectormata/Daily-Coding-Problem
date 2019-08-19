package Amazon.Test.ProblemTest_13;

import org.junit.jupiter.api.Test;

import static Amazon.Main.Problem_13.Problem_13.findLongestSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_13 {

    @Test
    public void checkForSubString() {

        String s = "abcba";
        int k = 2;
        int expected = 3;
        int answer = findLongestSubstring(s, k);

        assertEquals(expected, answer);
    }
}
