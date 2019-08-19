package Google.Test.ProblemTest_14;

import Google.Main.Problem_14.Problem_14;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_14 {

    @Test
    public void checkAreaOfACircle() {

        int piNumber = 1000;

        boolean expected = BigDecimal.valueOf(3.116).scale() > 3;

        double answer1 = Problem_14.pi(piNumber);
        boolean answer = BigDecimal.valueOf(answer1).scale() > 3;

        assertEquals(expected, answer);
    }
}
