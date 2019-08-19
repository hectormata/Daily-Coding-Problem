package Google.Main.Problem_8;

/**
 * This problem was asked by Google.
 *
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 * Given the root to a binary tree, count the number of unival subtrees.
 *
 * For example, the following tree has 5 unival subtrees:
 *
 *    0
 *   / \
 *  1   0
 *     / \
 *    1   0
 *   / \
 *  1   1
 */

public class Problem_8 {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(5);
        binaryTree.root.left = new Node(4);
        binaryTree.root.right = new Node(5);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(4);
        binaryTree.root.right.right = new Node(5);

        CountUnivalSubTree countUnivalSubTree = new CountUnivalSubTree();

        System.out.println(countUnivalSubTree.countSingle(binaryTree.root));
    }
}
