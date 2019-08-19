package Google.Main.Problem_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers
 * from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class Problem_1 {

    public static boolean CheckForNumsThatAddUp(int[] arr, int k) {

        if (arr.length == 0) {
            return false;
        }

        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int number : arr) {

            int remaining = k - number;
            if (set.contains(remaining)) {
                return true;
            }

            set.add(number);
        }

        return false;
    }
    public static void main(String[] args) {

        int[] arr = {10, 15, 3, 7};
        int k = 17;

        Arrays.sort(arr);
        System.out.println(CheckForNumsThatAddUp(arr, k));
    }
}
