package Airbnb.Test.ProblemTest_9;

import Airbnb.Main.Problem_9.Problem_9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_9 {

    @Test
    public void sum1() {

        int[] arr = {2, 4, 6, 2, 5};
        int expected = 13;
        int actual = Problem_9.nonAdjacentNumsSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void nonAdjacentSum1() {

        int[] arr = {5, 1, 1, 5};
        int expected = 10;
        int actual = Problem_9.nonAdjacentNumsSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void sum2() {

        int[] arr = {2, 4, 6, 2, 5};
        int expected = 13;
        int actual = Problem_9.nonAdjacentNumsSum(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void nonAdjacentSum2WithIfStatments() {

        int[] arr = {5, 1, 1, 5};
        int expected = 10;
        int actual = Problem_9.nonAdjacentNumsSumWithIfStatements(arr);

        assertEquals(expected, actual);
    }

}
