package Google.Test.ProblemTest_1;

import Google.Main.Problem_1.Problem_1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CheckForNumberThatAddUpTest {

    @Test
    public void checkSum1() {

        int[] arr = {10, 15, 3, 7};
        Arrays.sort(arr);
        int k = 17;
        assertTrue(Problem_1.CheckForNumsThatAddUp(arr,k));
    }

    @Test
    public void checkSum2() {

        int[] arr = {8, 15, 3, 7};
        Arrays.sort(arr);
        int k = 11;
        assertTrue(Problem_1.CheckForNumsThatAddUp(arr,k));
    }

    @Test
    public void checkSum3() {

        int[] arr = {10, 15, 3, 7};
        Arrays.sort(arr);
        int k = 18;
        assertTrue(Problem_1.CheckForNumsThatAddUp(arr,k));
    }

    @Test
    public void checkSum4() {

        int[] arr = {10, 15, 3, 7};
        Arrays.sort(arr);
        int k = 13;
        assertTrue(Problem_1.CheckForNumsThatAddUp(arr,k));
    }

    @Test
    public void checkSum5() {

        int[] arr = {10, 15, 3, 7};
        Arrays.sort(arr);
        int k = 22;
        assertTrue(Problem_1.CheckForNumsThatAddUp(arr,k));
    }
}