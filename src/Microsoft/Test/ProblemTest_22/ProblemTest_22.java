package Microsoft.Test.ProblemTest_22;

import org.junit.jupiter.api.Test;

import Microsoft.Main.Problem_22.Problem_22;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_22 {

    @Test
    public void checkSplitWords1() {

        List<String> expected = new ArrayList<>();
        expected.add("the");
        expected.add("quick");
        expected.add("brown");
        expected.add("fox");

        List<String> actual = Problem_22.splitWords(Problem_22.words("quick", "brown", "the", "fox"), "thequickbrownfox");

        assertEquals(expected, actual);
    }

    @Test
    public void checkSplitWords2() {

        List<String> expected = new ArrayList<>();
        expected.add("bed");
        expected.add("bath");
        expected.add("and");
        expected.add("beyond");
        List<String> actual = Problem_22.splitWords(Problem_22.words("bed", "bath", "bedbath", "and", "beyond"), "bedbathandbeyond");

        assertEquals(expected, actual);
    }

    @Test
    public void checkSplitWords3() {

        List<String> expected = new ArrayList<>();
        expected.add("theremin");
        List<String> actual = Problem_22.splitWords(Problem_22.words("the", "theremin"), "theremin");

        assertEquals(expected, actual);
    }

    @Test
    public void checkSplitWords4() {

        List<String> expected = null;
        List<String> actual = Problem_22.splitWords(Problem_22.words("a", "aa", "aaa", "aaaa", "aaaaa"), "aaaaab");

        assertEquals(expected, actual);
    }

}
