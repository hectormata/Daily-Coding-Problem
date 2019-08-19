package Stripe.Main.Problem_4;

import java.util.TreeSet;

/**
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and
 * constant space. In other words, find the lowest positive integer that does not exist
 * in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 * You can modify the input array in-place.
 */
public class Problem_4 {

    public static int findMissingNum(TreeSet<Integer> arr2Test) {

        int foundNum = 1;

        while (true) {
            if (!arr2Test.contains(foundNum)) {
                break;
            }
            foundNum++;
        }
        return foundNum;
    }

    /**
     * Utility function that puts all non-positive
     *        (0 and negative) numbers on left side of
     *        arr[] and return count of such numbers
     *
     * @param arr - Input array
     * @param size - Size of the array
     * @return - return the count of number taken that are 0 and negative
     */
    public static int segrate(int[] arr, int size) {

        int j = 0;

        for (int i = 0; i < size; i++) {

            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Increment count of non-positve integers
                j++;
            }
        }

        return j;
    }

    /**
     * Find the smallest positive missing
     *        number in an array that contains
     *        all positive integers
     *
     * @param arr - Input array
     * @param size - Size of the array
     * @return  - Return missing number
     */
    public static int findMissingPositive(int[] arr, int size) {

        for (int i = 0; i < size; i++) {

            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0) {
                arr[x - 1] = -arr[x - 1];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                return i + 1;
        }

        return size + 1;
    }

    /**
     * Find the smallest positive missing
     *        number in an array that contains
     *        both positive and negative integers
     *
     * @param arr - Input array
     * @param size - Size of array
     * @return - retrun missing number
     */
    public static int findMissing(int[] arr, int size) {

        // First separate positive and negative numbers
        int shift = segrate(arr, size);
        int[] arr2 = new int[size - shift];
        int j = 0;

        for (int i = shift; i < size; i++) {

            arr2[j] = arr[i];
            j++;
        }

        // Shift the array and call findMissingPositive for positive part
        return findMissingPositive(arr2, j);
    }

    /**
     * Test client
     * @param args - Parameters of program
     */
    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int arrSize = arr.length;

        int missingNum = findMissing(arr, arrSize);
        System.out.println(missingNum);
    }
}