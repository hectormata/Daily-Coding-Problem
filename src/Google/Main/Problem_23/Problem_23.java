package Google.Main.Problem_23;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * This problem was asked by Google.
 *
 * You are given an M by N matrix consisting of booleans that represents a
 * board. Each True boolean represents a wall. Each False boolean represents a
 * tile you can walk on.
 *
 * Given this matrix, a start coordinate, and an end coordinate, return the
 * minimum number of steps required to reach the end coordinate from the start.
 * If there is no possible path, then return null. You can move up, left, down,
 * and right. You cannot move through walls. You cannot wrap around the edges
 * of the board.
 *
 * For example, given the following board:
 * 	[[f, f, f, f],
 * 	[t, t, f, t],
 * 	[f, f, f, f],
 * 	[f, f, f, f]]
 *
 * and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum
 * number of steps required to reach the end is 7, since we would need to go
 * through (1, 2) because there is a wall everywhere else on the second row.
 *
 */
public class Problem_23 {

    public static final class Point {

        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isEqual(Point point) {
            return x == point.x && y == point.y;
        }

        public String toString() {
            return "[" + x + ";" + y + "]";
        }
    }

    public static Integer findMinimumPathLength(boolean[][] board, Point from, Point to) {

        int[][] steps = new int[board.length][board[0].length];
        Arrays.stream(steps).forEach(row -> Arrays.fill(row, -1));

        Deque<Point> queue = new LinkedList<>();
        queue.add(from);
        steps[from.y][from.x] = 0;

        while (!queue.isEmpty()) {

            Point point = queue.remove();

            if (point.isEqual(to)) {
                continue;
            }

            for (Point nextPoint : Arrays.asList(new Point(point.x + 1, point.y), new Point(point.x, point.y -1),
                    new Point(point.x - 1, point.y), new Point(point.x, point.y + 1))) {

                if (!isStepAvaiable(board, nextPoint)) {
                    continue;
                }

                if (steps[nextPoint.y][nextPoint.x] >= 0 && steps[point.y][nextPoint.x]+ 1 >= steps[nextPoint.y][nextPoint.x]) {
                    continue;
                }

                steps[nextPoint.y][nextPoint.x]= steps[point.y][point.x]+ 1;
                queue.add(nextPoint);
            }
        }

        return steps[to.y][to.x] == Integer.MAX_VALUE ? null : steps[to.y][to.x];

    }

    private static boolean isStepAvaiable(boolean[][] board, Point point) {
        return point.y >= 0 && point.y < board.length && point.x >= 0 && point.x < board[point.y].length && !board[point.y][point.x];
    }

    public static void main(String[] args) {

        boolean[][] board = {
                {false, false, false, false},
                {true, true, false, true},
                {false, false, false, false},
                {false, false, false, false}};

        System.out.println(findMinimumPathLength(board, new Point(0, 3), new Point(0, 0)));
    }
}
