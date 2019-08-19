package Google.Main.Problem_3;

import Util_Files.Node;

import java.util.Scanner;

/**
 * This problem was asked by Google.
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into
 * a string, and deserialize(s), which deserializes the string back into the tree.
 *
 * For example, given the following Node class
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 * The following test should pass:
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */
public class Problem_3 {

    private String MARKER = ")";

    public Problem_3() {

        Node n1 = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        Node n2 = new Node("root", null, new Node("right"));
        display(n1);
        display(n2);
    }

    public Node DeserializeWrapper(String s) {

        Scanner sc = null;

        try {
            sc = new Scanner(s);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return deserialize(sc);
    }

    public Node deserialize(Scanner sc) {

        if (!sc.hasNext())
            return null;

        String currentWord = sc.next();
        if (currentWord.equals(MARKER))
            return null;

        return new Node(currentWord, deserialize(sc), deserialize(sc));
    }

    public String serialize(Node n) {
        return n.toString();
    }

    public void display(Node n) {
        String serialized = serialize(n);
        String deserialized = DeserializeWrapper(serialized).toString();

        System.out.println(getTitle("Serialized"));
        System.out.print(serialized);
        System.out.println(getTitle("Deserialized"));
        System.out.print(deserialized);
    }

    public String getTitle(String s) {
        String header = "";
        String footer = "";
        for (int i = 0; i < s.length(); i++) {
            header += "#";
            footer += "#";
        }
        return "\n" + header + "\n" + s + "\n" + footer + "\n";
    }

    public static void main(String[] args) {
        new Problem_3();
    }
}
