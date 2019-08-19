package Amazon.Main.Problem_29;

/**
 * This problem was asked by Amazon.
 *
 * Run-length encoding is a fast and simple method of encoding strings.
 * The basic idea is to represent repeated successive characters as a single
 * count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
 *
 * Implement run-length encoding and decoding. You can assume the string to be encoded have no
 * digits and consists solely of alphabetic characters. You can assume the string to be
 * decoded is valid.
 */
public class Problem_29 {

    public static String encode(String str) {
        StringBuilder buf = new StringBuilder(str.length());
        char ch = '\0';
        int length = 0;


        for (int i = 0; i < str.length(); i++) {
            if (ch == '\0' || ch == str.charAt(i)) {
                ch = str.charAt(i);
                length++;
            } else {
                buf.append(length).append(ch);
                ch = str.charAt(i);
                length = 1;
            }
        }

        if (ch != '\0')
            buf.append(length).append(ch);

        return buf.toString();
    }

    public static String decode(String str) {
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < str.length(); ) {
            int length = str.charAt(i++) - '0';
            char ch = str.charAt(i++);

            for (int j = 0; j < length; j++)
                buf.append(ch);
        }

        return buf.toString();
    }

    public static void main(String[] args) {

        String inputToEnconde = "AAAABBBCCDAA";
        String inputToDecode = "4A3B2C1D2A";

        System.out.println(encode(inputToEnconde));

        System.out.println(decode(inputToDecode));
    }
}
