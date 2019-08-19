package Google.Main.Problem_8;

public class CountUnivalSubTree {

    private Count count = new Count();

    public boolean countSingleRec(Node node, Count count) {

        if (node == null) {
            return true;
        }

        boolean left = countSingleRec(node.left, count);
        boolean right = countSingleRec(node.right, count);

        if (left == false || right == false) {
            return false;
        }

        if (node.left != null && node.val != node.left.val) {
            return false;
        }

        if (node.right != null && node.val != node.right.val) {
            return false;
        }

        count.count++;
        return true;
    }

    public int countSingle(Node node) {
        countSingleRec(node, count);
        return count.count;
    }
}
