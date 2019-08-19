package Google.Main.Problem_6;

public class Node {

    int data;
    int XOROfPrevNxt;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getXOROfPrevNxt() {
        return XOROfPrevNxt;
    }

    public void setXOROfPrevNxt(int XOROfPrevNxt) {
        this.XOROfPrevNxt = XOROfPrevNxt;
    }
}
