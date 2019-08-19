package Google.Main.Problem_14;

/**
 * This problem was asked by Google.
 *
 * The area of a circle is defined as pi*r^2. Estimate pi to 3
 * decimal places using a Monte Carlo method.
 *
 * Hint: The basic equation of a circle is x2 + y2 = r2.
 */

public class Problem_14 {

    public static double pi(int N) {

        int M = 0;

        for (int i = 0; i < N; i++) {

            double x = Math.random();
            double y = Math.random();

            if (x * x + y * y <= 1)
                M++;
        }

        return 4 * (double) M / (double) N;
    }

    public static void main(String[] args) {

        double x = pi(1000);
        System.out.println(x);
    }

}
