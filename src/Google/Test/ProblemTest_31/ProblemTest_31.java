package Google.Test.ProblemTest_31;

import Google.Main.Problem_31.Problem_31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_31 {

    @Test
    public void checkCountIsReturn() {

        String expected1 = "kitten";
        String expected2 = "sitting";
        int count = 3;

        int howManyTimes = Problem_31.calculateEditDistance(expected1, expected2);

        assertEquals(count, howManyTimes);
    }

    @Test
    public void checkIfWordisTheSame() {
        String expected1 = "kitten";
        String expected2 = "kitten";
        int count = 0;

        int howManyTimes = Problem_31.calculateEditDistance(expected1, expected2);

        assertEquals(count, howManyTimes);
    }
    @Test
    public void checkIfOneWorkIsEmpty() {

        String expected1 = "";
        String expected2 = "sitting";
        int count = 7;

        int howManyTimes = Problem_31.calculateEditDistance(expected1, expected2);

        assertEquals(count, howManyTimes);

    }

    @Test
    public void checkBothEmptyString() {

        String expected1 = "";
        String expected2 = "";
        int count = 0;

        int howManyTimes = Problem_31.calculateEditDistance(expected1, expected2);

        assertEquals(count, howManyTimes);
    }
}
