package Google.Test.ProblemTest_23;

import Google.Main.Problem_23.Problem_23;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_23 {

    @Test
    public void checkPathLength() {

        boolean[][] board = {
                {false, false, false, false},
                {true, true, false, true},
                {false, false, false, false},
                {false, false, false, false}};
        int expected = 7;
        int actual = Problem_23.findMinimumPathLength(board, new Problem_23.Point(0, 3), new Problem_23.Point(0, 0));

        assertEquals(expected, actual);
    }
}
