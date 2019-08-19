package Google.Test.ProblemTest_26;

import Google.Main.Problem_26.Problem_26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_26 {

    @Test
    public void checkKthElement() {

        String expected = "[0, 1, 2, 3, 4] -> [0, 1, 2, 3]";
        String actual = Problem_26.test(5, 0); // [0, 1, 2, 3]

        assertEquals(expected, actual);

    }

    @Test
    public void checkKthElement1() {

        String expected = "[0, 1, 2, 3, 4] -> [0, 1, 2, 4]";
        String actual = Problem_26.test(5, 1); // [0, 1, 2, 4]

        assertEquals(expected, actual);
    }

    @Test
    public void checkKthElement2() {

        String expected = "[0, 1, 2, 3, 4] -> [0, 1, 3, 4]";
        String actual = Problem_26.test(5, 2); // [0, 1, 3, 4]

        assertEquals(expected, actual);
    }

    @Test
    public void checkKthElement3() {

        String expected = "[0, 1, 2, 3, 4] -> [0, 2, 3, 4]";
        String actual = Problem_26.test(5, 3); // [0, 2, 3, 4]

        assertEquals(expected, actual);
    }

    @Test
    public void checkKthElement4() {

        String expected = "[0, 1, 2, 3, 4] -> [1, 2, 3, 4]";
        String actual = Problem_26.test(5, 4); // [1, 2, 3, 4]

        assertEquals(expected, actual);
    }

    @Test
    public void checkKthElement5() {

        String expected = "[0] -> []";
        String actual = Problem_26.test(1, 0); // []

        assertEquals(expected, actual);
    }
}
