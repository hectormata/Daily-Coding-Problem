package Google.Test.ProblemTest_6;

import Google.Main.Problem_6.Problem_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest6 {

    @Test
    public void getIndexData1() {

        int index = 0;
        int expected = 1;
        Problem_6 prob = new Problem_6();
        prob.addToEnd(1);
        prob.addToEnd(2);
        prob.addToEnd(3);


        assertEquals(expected, prob.getNodeAtIndex(index).getData());
    }

    @Test
    public void getIndexData2() {

        int index = 1;
        int expected = 2;
        Problem_6 prob = new Problem_6();
        prob.addToEnd(1);
        prob.addToEnd(2);
        prob.addToEnd(3);


        assertEquals(expected, prob.getNodeAtIndex(index).getData());
    }

    @Test
    public void getIndexData3() {

        int index = 2;
        int expected = 3;
        Problem_6 prob = new Problem_6();
        prob.addToEnd(1);
        prob.addToEnd(2);
        prob.addToEnd(3);


        assertEquals(expected, prob.getNodeAtIndex(index).getData());
    }
}
