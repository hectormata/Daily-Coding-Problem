package Util_Files;

public final class Node {

    private String MARKER = ")";

    public String val;
    public Node left;
    public Node right;

    public Node(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Node(String vale, Node left, Node right) {
        this.val = val;

        if (left != null) {
            this.left = left;
        }
        if (right != null) {
            this.right = right;
        }
    }

    public String toString() {
        String str = val + " ";

        if (this.left != null)
            str += this.left.toString();
        if (this.right != null)
            str += this.right.toString();
        if (this.left == null)
            str += MARKER + " ";
        if (this.right == null)
            str += MARKER + " ";
        return str;
    }
}
