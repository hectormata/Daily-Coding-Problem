package Snapchat.Main.Problem_21;

import Util_Files.Interval;

import java.util.Map;
import java.util.TreeMap;

/**
 * This problem was asked by Snapchat.
 * Given an array of time intervals (start, end) for classroom lectures
 * (possibly overlapping), find the minimum number of rooms required.
 *
 * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */
public class Problem_21 {

    public static int getRequiredRoomsAmount(Interval[] intervals) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (Interval interval : intervals) {

            map.put(interval.start, map.getOrDefault(interval.start, 0) + 1);
            map.put(interval.end, map.getOrDefault(interval.end, 0) - 1);
        }

        int res = 0;
        int count = 0;

        for (int delta : map.values()) {

            res = Math.max(res, count += delta);
        }

        return res;
    }

    public static void main(String[] args) {

        Interval intOne   = new Interval(30, 75);
        Interval intTwo   = new Interval(30, 75);
        Interval intThree = new Interval(30, 75);
        System.out.println(getRequiredRoomsAmount(new Interval[]{
                intOne,
                intTwo,
                intThree
        }));
    }
}
