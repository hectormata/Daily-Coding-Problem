package Facebook.Main.Problem_30;

/**
 * This problem was asked by Facebook.
 *
 * You are given an array of non-negative integers that represents a two-dimensional
 * elevation map where each element is unit-width wall and the integer is the height.
 * Suppose it will rain and all spots between two walls get filled up.
 *
 * Compute how many units of water remain trapped on the map in O(N) time and O(1) space.
 *
 * For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.
 * Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second,
 * and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.
 */
public class Problem_30 {
    // Method for maximum amount of water
    public static int findWater(int n, int[] arr) {

        // Left[i] contains height of tallest bar of the left of the i'th bar including itself
        int left[] = new int[n];

        // Right [i] contains height of tallest bar of the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i-1], arr[i]);

        // Fill right array
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i],right[i]) - arr[i];

        return water;
    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 1, 2};
        int[] input1 = new int[]{3, 0, 1, 3, 0, 5};

        System.out.println(findWater(input1.length, input1));
    }
}
