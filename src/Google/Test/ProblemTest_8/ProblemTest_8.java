package Google.Test.ProblemTest_8;

import Google.Main.Problem_8.BinaryTree;
import Google.Main.Problem_8.CountUnivalSubTree;
import Google.Main.Problem_8.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest_8 {

    private static BinaryTree binaryTree;
    @Test
    public void countUnivalSubtrees() {

        int expected = 5;
        binaryTree = new BinaryTree();
        binaryTree.root = new Node(5);
        binaryTree.root.left = new Node(4);
        binaryTree.root.right = new Node(5);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(4);
        binaryTree.root.right.right = new Node(5);

        CountUnivalSubTree countUnivalSubTree = new CountUnivalSubTree();
        assertEquals(expected, countUnivalSubTree.countSingle(binaryTree.root));
    }
}
