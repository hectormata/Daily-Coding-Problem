package Google.Main.Problem_31;

/**
 * This problem was asked by Google.
 *
 * The edit distance between two strings refers to the minimum number of character insertions,
 * deletions, and substitutions required to change one string to the other. For example,
 * the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”,
 * substitute the “e” for “i”, and append a “g”.
 *
 * Given two strings, compute the edit distance between them.
 */
public class Problem_31 {


    public static int calculateEditDistance(String str1, String str2) {

        // If either string is empty, difference is insert all chars from the other
        if (str1.length() == 0)
            return str2.length();
        if (str2.length() == 0)
            return str1.length();

        // if the first letter are the same, the difference is whatever is required to edit
        // the rest of the strings
        if (str1.charAt(0) == str2.charAt(0))
            return calculateEditDistance(str1.substring(1), str2.substring(1));


        // Otherwise we will change first letter of s to that of t, remove first letter of s, or
        // remove first letter of t
        int a = calculateEditDistance(str1.substring(1), str2.substring(1));
        int b = calculateEditDistance(str1, str2.substring(1));
        int c = calculateEditDistance(str1.substring(1), str2);

        if (a > b)
            a = b;
        if (a > c)
            a = c;

        // any of which is 1 edit plus editing the rest of the strings
        return a + 1;
    }

    public static void main(String[] args) {

        String input1 = "kitten";
        String input2 = "sitting";

        System.out.println(calculateEditDistance(input1, input2));
    }
}
