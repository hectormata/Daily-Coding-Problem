package Airbnb.Main.Problem_9;

/**
 * This problem was asked by Airbnb.
 *
 * Given a list of integers, write a function that returns the largest sum of
 * non-adjacent numbers. Numbers can be 0 or negative.
 *
 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
 * [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 *
 * Follow-up: Can you do this in O(N) time and constant space?
 */
public class Problem_9 {

    public static int nonAdjacentNumsSum(int[] array) {

        int size = array.length;
        int incl = array[0];
        int excl = 0;
        int excl_new;

        for (int i = 1; i < size; i++) {

            excl_new = (incl > excl) ? incl : excl;

            incl = excl + array[i];
            excl = excl_new;

        }

        return ((incl > excl) ? incl : excl);
    }

    public static int nonAdjacentNumsSumWithIfStatements(int[] array) {

        int size = array.length;
        int incl = array[0];
        int excl = 0;
        int excl_new;

        for (int i = 1; i < size; i++) {

            if (incl > excl) {
                excl_new = incl;
            }
            else {
                excl_new = excl;
            }

            incl = excl + array[i];
            excl = excl_new;

        }

        if (incl > excl) {
            return incl;
        }

        else {
            return excl;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 2, 5};
        System.out.println(nonAdjacentNumsSum(arr));
        System.out.println(nonAdjacentNumsSumWithIfStatements(arr));
    }
}
