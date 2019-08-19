package Microsoft.Test.ProblemTest_33;

import org.junit.jupiter.api.Test;

import static Microsoft.Main.Problem_33.Problem_33.printMedian;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ProblemTest_33 {

    @Test
    public void checkHowManyElementsShouldComeOut() {

        int[] sequence = new int[]{2,1,5,7,2,0,5};
        int actual = printMedian(sequence);
        int expected = 7;

        assertEquals(expected, actual);
    }
    @Test
    public void checkMedianInSequence() {

        fail("Not Yet Implemented");
    }
}
