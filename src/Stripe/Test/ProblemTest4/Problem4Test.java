package Stripe.Test.ProblemTest4;

import Stripe.Main.Problem_4.Problem_4;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    public void FindMissingNumber1() {

        int[] arr = {3, 4, -1, 1};
        int expected = 2;
        int actual = Problem_4.findMissing(arr, arr.length);

        assertEquals(expected, actual);

    }

    @Test
    public void FindMissingNumber2() {

        int[] arr = {1, 2, 0};
        int expected = 3;
        int actual = Problem_4.findMissing(arr, arr.length);

        assertEquals(expected, actual);
    }

    @Test
    public void FindMissingNumber3() {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(-1);
        treeSet.add(1);

        int expected = 2;
        int actual = Problem_4.findMissingNum(treeSet);

        assertEquals(expected, actual);

    }

    @Test
    public void FindMissingNumber4() {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(0);
        int expected = 3;

        int actual = Problem_4.findMissingNum(treeSet);

        assertEquals(expected, actual);
    }
}