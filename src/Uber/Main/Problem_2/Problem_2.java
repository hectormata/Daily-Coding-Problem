package Uber.Main.Problem_2;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the
 * new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 *
 */
public class Problem_2 {

    public static int[] makeProductArray(int[] arr) {

        if (arr.length == 0)
            return null;

        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = 1;

            for (int j = 0; j < answer.length; j++) {

                if (j != i) {
                    answer[i] *= arr[j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Arrays.sort(arr);

        int[] answer = makeProductArray(arr);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}
