package Facebook.Main.Problem_15;

/**
 *
 * This problem was asked by Facebook.
 *
 * Given a stream of elements too large to store in memory,
 * pick a random element from the stream with uniform probability.
 *
 */

import java.security.SecureRandom;
import java.util.Random;

public class Problem_15 {

    private static int res   = 0;   // The result random number
    private static int count = 0;   // Count of numbers visited

    public static int selectRandom(int x) {

        // Increment count of numbers seen so far
        count++;

        // If this is the first element from stream, return it
        if (count == 1)
            res = x;
        else {

            // Generate a random number from 0 to count - 1
            Random r = new Random();
            int i = r.nextInt(count);

            // Replace the prev random number with new number with probability 1/count
            if (i == count - 1)
                res = x;
        }

        return res;
    }

    public static int randomSol(int[] stream, int i) {

        if (i == 0)
            return stream[i];

        return stream[new SecureRandom().nextInt(i)];
    }

    public static void main(String[] args) {

        int[] stream = {1, 2, 3, 4};
        int n = stream.length;

        System.out.println(randomSol(stream, 2));
        for (int i = 0; i < n; i++) {
            System.out.println("Random number from first " + (i + 1) +
                    " numbers is " + selectRandom(stream[i]));
        }
    }
}
