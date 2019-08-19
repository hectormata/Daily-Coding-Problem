package Facebook.Test.ProblemTest_30;


import org.junit.jupiter.api.Test;

import static Facebook.Main.Problem_30.Problem_30.findWater;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_30 {

    @Test
    public void checkWater() {

        int expected = 8;
        int[] input = new int[]{3, 0, 1, 3, 0, 5};
        int actual = findWater(input.length, input);

        assertEquals(expected, actual);

    }

}
