package Google.Main.Problem_8;

public class BinaryTree {

    public Node root;

    public BinaryTree(int val) {
        this.root = new Node(val);
    }

    public BinaryTree() {
        root = null;
    }

    public String toString() {
        return "BinaryTree {" +
                "root = " + root +
                "}";
    }
}
