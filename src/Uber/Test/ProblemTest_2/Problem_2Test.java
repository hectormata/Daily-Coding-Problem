package Uber.Test.ProblemTest_2;

import Uber.Main.Problem_2.Problem_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_2Test {

    @Test
    public void makeProductArray1() {

        int[] arr = {1, 2, 3, 4, 5};
        int[] answer = {120, 60, 40, 30, 24};

        int ans[] = Problem_2.makeProductArray(arr);

        for (int i = 0; i < ans.length; i++) {

            assertEquals(ans[i], answer[i]);
        }
    }

    @Test
    public void makeProductArray2() {

        int[] arr = {3, 2, 1};
        int[] answer = {2, 3, 6};

        int ans[] = Problem_2.makeProductArray(arr);
        for (int i = 0; i < ans.length; i++) {

            assertEquals(ans[i], answer[i]);
        }
    }

    @Test
    public void makeProductArray3() {

        int[] arr = {3, 4, 5};
        int[] answer = {20, 15, 12};

        int ans[] = Problem_2.makeProductArray(arr);
        for (int i = 0; i < ans.length; i++) {

            assertEquals(ans[i], answer[i]);
        }
    }
}