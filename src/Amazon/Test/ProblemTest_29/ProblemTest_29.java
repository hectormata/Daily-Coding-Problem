package Amazon.Test.ProblemTest_29;

import org.junit.jupiter.api.Test;

import static Amazon.Main.Problem_29.Problem_29.decode;
import static Amazon.Main.Problem_29.Problem_29.encode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_29 {

    @Test
    public void checkEncode() {

        String inputToEnconde = "AAAABBBCCDAA";
        String expected = "4A3B2C1D2A";
        String actual = encode(inputToEnconde);

        assertEquals(expected, actual);
    }

    @Test
    public void checkDecode() {

        String inputToDecode = "4A3B2C1D2A";
        String expected = "AAAABBBCCDAA";

        String actual = decode(inputToDecode);

        assertEquals(expected, actual);

    }
}
