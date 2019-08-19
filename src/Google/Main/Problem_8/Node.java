package Google.Main.Problem_8;

public class Node {

    public int val;
    public Node left, right;

    public Node(int key) {
        this.val    = key;
        this.left   = null;
        this.right  = null;
    }

    public String toString() {

        return "Node {" +
                "Val = " + this.val +
                ", Left = " + this.left +
                ", Right = " + this.right +
                "}";
    }
}
