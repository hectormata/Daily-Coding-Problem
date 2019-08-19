package Amazon.Test.ProblemTest_12;

import org.junit.jupiter.api.Test;

import static Amazon.Main.Problem_12.Problem_12.possibleNumberOfStepsN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_12 {

    @Test
    public void checkClimbFirstWay() {

        int N = 4;
        int[] possibleSteps = {1, 2};
        int expected = 5;


        assertEquals(expected, possibleNumberOfStepsN(N, possibleSteps));
    }
}
