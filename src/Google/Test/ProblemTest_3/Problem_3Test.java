package Google.Test.ProblemTest_3;

import Util_Files.Node;
import Google.Main.Problem_3.Problem_3;
import org.junit.jupiter.api.Test;

class Problem_3Test {
    private String MARKER = ")";

    @Test
    public void check() {

        Problem_3 prob = new Problem_3();
        Node n1 = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        Node n2 = new Node("root", null, new Node("right"));

        prob.display(n1);
        prob.display(n2);

    }

}