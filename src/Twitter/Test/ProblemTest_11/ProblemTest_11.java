package Twitter.Test.ProblemTest_11;

import Twitter.Main.Problem_11.Problem_11;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_11 {

    @Test
    public void checkForAutoCompletion() {

        Problem_11 test1 = new Problem_11();

        test1.insertTree("dog");
        test1.insertTree("deer");
        test1.insertTree("deal");

        // System.out.println(test.searchEntireWord("deer"));

        Set<String> set = test1.findSuggestions("de");
        Set<String> actualSet = new HashSet<>();

        actualSet.add("deer");
        actualSet.add("deal");

        assertEquals(actualSet, set);
    }
}
