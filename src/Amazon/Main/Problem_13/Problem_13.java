package Amazon.Main.Problem_13;

/**
 * This problem was asked by Amazon.
 *
 * Given an integer k and a string s, find the length of the longest substring that
 * contains at most k distinct characters.
 *
 * For example, given s = "abcba" and k = 2, the longest substring with
 * k distinct characters is "bcb".
 *
 */

import java.util.HashMap;

public class Problem_13 {

    public static int findLongestSubstring(String s, int k) {

        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int start = 0;
        int max   = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
                while (map.size() > k) {
                    char rm = s.charAt(start);
                    int tempCount = map.get(rm);

                    if (tempCount > 1) {
                        map.put(rm, tempCount - 1);
                    }
                    else {
                        map.remove(rm);
                    }
                    start++;
                    count--;
                }
            }
            count++;
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcba";
        int k = 2;
        int answer = findLongestSubstring(s, k);
        System.out.println(answer);
    }
}
