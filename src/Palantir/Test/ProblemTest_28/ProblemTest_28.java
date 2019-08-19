package Palantir.Test.ProblemTest_28;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Palantir.Main.Problem_28.Problem_28.justify;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_28 {

    @Test
    public void checkText() {

        List<String> expected = new ArrayList<>();
        expected.add("the  quick brown");
        expected.add("fox  jumps  over");
        expected.add("the   lazy   dog");


        List<String> input1 = new ArrayList<>();
        input1.add("the");
        input1.add("quick");
        input1.add("brown");
        input1.add("fox");
        input1.add("jumps");
        input1.add("over");
        input1.add("the");
        input1.add("lazy");
        input1.add("dog");
        int k = 16;

        List<String> actual = justify(input1, k);

        assertEquals(expected, actual);
    }
}
