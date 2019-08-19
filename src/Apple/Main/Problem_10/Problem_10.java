package Apple.Main.Problem_10;

/**
 * This problem was asked by Apple.
 *
 * Implement a job scheduler which takes in a function f and an integer n, and
 * calls f after n milliseconds.
 *
 */
import static java.lang.Thread.sleep;

public class Problem_10 {

    public static void scheduleJob(Runnable runnable, int time) {
        new Thread(() -> {
            try {
                sleep(time);
                runnable.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {

        scheduleJob(()-> System.out.println("Print me, after 5 Seconds."), 5000);
    }
}