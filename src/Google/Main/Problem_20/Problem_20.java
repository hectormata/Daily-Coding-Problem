package Google.Main.Problem_20;

/**
 * This problem was asked by Google.
 *
 * Given two singly linked lists that intersect at some point, find the
 * intersecting node. The lists are non-cyclical.
 *
 * For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10,
 * return the node with value 8.
 *
 * In this example, assume nodes with the same value are the exact same node objects.
 *
 * Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
 */
public class Problem_20 {

    private static final class Node {

        private final int value;
        private final Node next;

        public Node(int value, Node next) {
            this.value  = value;
            this.next   = next;
        }
    }

    public static Node findIntersectionNode(Node one, Node two) {

        int lengthOne = getLength(one);
        int lengthTwo = getLength(two);

        if (lengthOne > lengthTwo) {
            one = skip(one, lengthOne - lengthTwo);
        }
        else if (lengthOne < lengthTwo) {
            two = skip(two, lengthTwo - lengthOne);
        }

        while (one != null && one != two) {
            one = one.next;
            two = two.next;
        }

        return one;
    }

    private static int getLength(Node node) {

        int length = 0;

        while (node != null) {
            node = node.next;
            length++;
        }

        return length;
    }

    private static Node skip(Node node, int count) {

        while (node != null && count > 0) {
            node = node.next;
            count--;
        }

        return node;
    }

    public static void main(String[] args) {

        Node node10 = new Node(10, null);
        Node node8  = new Node(8, node10);
        Node node7  = new Node(7, node8);
        Node node3  = new Node(3, node7);
        Node node1  = new Node(1, node8);
        Node node99 = new Node(99, node1);

        Node res = findIntersectionNode(node3, node99);
        System.out.println(res.value);
    }
}
