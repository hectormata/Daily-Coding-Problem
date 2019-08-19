package Amazon.Main.Problem_12;

/**
 * This problem was asked by Amazon.
 * There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
 * Given N, write a function that returns the number of unique ways you can climb the staircase.
 * The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 * •	1, 1, 1, 1
 * •	2, 1, 1
 * •	1, 2, 1
 * •	1, 1, 2
 * •	2, 2
 * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number
 * from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5
 * steps at a time.
 *
 */
public class Problem_12 {

    public static int findPossibleStepNumber(int n) {

        int[] steps = new int[n + 1];
        return climbIt(steps, 0, n);
    }

    public static int possibleNumberOfStepsN(int n, int[] steps) {

        int[] newArr = new int[n + 1];
        return findWaysToclimbStairs(newArr, 0, n, steps);
    }

    private static int findWaysToclimbStairs(int[] step, int count, int n , int[] steps) {

        if (count > n)
            return 0;
        if (count == n)
            return 1;

        if (step[count] > 0) {
            return step[count];
        }

        for (int way : steps) {

            step[count] += findWaysToclimbStairs(step, count + way, n, steps);
        }

        return step[count];
    }

    private static int climbIt(int[] steps, int count, int n) {

        if (count > n)
            return 0;

        if (count == n)
            return 1;

        if (steps[count] > 0)
            return steps[count];

        steps[count] = climbIt(steps, count + 1, n) + climbIt(steps, count + 2, n);

        return steps[count];
    }


    // Another way
    public static int climbStairs(int n) {

        if (n == 1 || n == 0)
            return 1;
        else if (n == 2)
            return 2;
        else
            return climbStairs(n - 2) + climbStairs(n - 1);

    }

    public static void main(String[] args) {

        int N = 4;
        int[] possibleSteps = {1, 2};
        int[] possibleSteps2 = {1, 3, 5};

        // Way one
        System.out.println(findPossibleStepNumber(N));

        // Way two
        int answer = climbStairs(N);
        System.out.println(answer);

        // Way three
        System.out.println(possibleNumberOfStepsN(N, possibleSteps));

        // Way four with steps 1, 3, 5
        System.out.println(possibleNumberOfStepsN(N, possibleSteps2));

    }
}
