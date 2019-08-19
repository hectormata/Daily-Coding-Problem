package Facebook.Main.Problem_7;

import java.util.HashMap;
import java.util.Map;

/**
 * This problem was asked by Facebook.
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count
 * the number of ways it can be decoded.
 *
 * For example, the message '111' would give 3, since it could be decoded
 * as 'aaa', 'ka', and 'ak'.
 *
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 *
 */
public class Problem_7 {

    /**
     * Decode message
     * @param arr input
     * @param size of the input array
     * @return the count of the possible ways to decode msg
     */
    public static int encodedMsg(char[] arr, int size) {

        // Base case
        if (size == 0 || size == 1)
            return 1;

        // init count
        int count = 0;

        // If last digit is not zero then last char must add to the numbers of possible words
        if (arr[size - 1] > '0') {
            count = encodedMsg(arr, size -1);
        }

        // If the last char number are smaller than or equal to 26, then let's take the last two digits
        if (arr[size - 2] == '1' || arr[size - 2] == '2' && arr[size - 1] < '7') {
            count += encodedMsg(arr, size - 2);
        }

        return count;
    }

    /**
     * Test client
     * @param args parameters
     */
    public static void main(String[] args) {

        char[] msg = {'1', '1', '1'};
        int size = msg.length;

        int answer = encodedMsg(msg, size);
        System.out.println(answer);
    }
}
