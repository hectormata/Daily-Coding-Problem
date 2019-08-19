package Google.Main.Problem_6;

import java.util.HashMap;

/**
 * This problem was asked by Google.
 *
 * An XOR linked list is a more memory efficient doubly linked list. Instead of each node
 * holding next and prev fields, it holds a field named both, which is an XOR of the next
 * node and the previous node. Implement an XOR linked list; it has an add(element) which
 * adds the element to the end, and a get(index) which returns the node at index.
 * If using a language that has no pointers (such as Python), you can assume you have
 * access to get_pointer and dereference_pointer functions that converts between nodes
 * and memory addresses.
 *
 */
public class Problem_6 {

    private Node head, tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    private HashMap<Integer, Node> map = new HashMap<>();

    /**
     * Insert data at the end of the XOR linked list
     * @param data to be stored in the end of the list
     */
    public void addToEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.setXOROfPrevNxt(0);
            head = tail = newNode;
        }
        else if (head == tail) {
            newNode.setXOROfPrevNxt(getPointer(null) ^ getPointer(tail));
            head.setXOROfPrevNxt(getPointer(null) ^ getPointer(newNode));
            tail = newNode;
        }
        else {

            Node prev = dereferencePointer(tail.getXOROfPrevNxt() ^ getPointer(null) );
            newNode.setXOROfPrevNxt(getPointer(null) ^ getPointer(tail));
            tail.setXOROfPrevNxt(getPointer(prev) ^ getPointer(newNode));
            tail = newNode;
        }
        map.put(getPointer(newNode), newNode);
    }

    /**
     * Get the node at a particular index starting from 0
     * @param index for which the data is retrived
     * @return the node at the index
     */
    public Node getNodeAtIndex(int index) {

        Node prev = null;
        Node curr = head;
        Node next;
        int j = 0;

        while (curr != null) {
            if (index == j) {
                return curr;
            }

            j++;
            next = dereferencePointer(getPointer(prev) ^ curr.getXOROfPrevNxt());
            prev = curr;
            curr = next;
        }
        return null;
    }

    /**
     * Traverse the list in forward direction
     */
    public void traverseInForward() {

        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            next = dereferencePointer(getPointer(prev) ^ curr.getXOROfPrevNxt());
            prev = curr;
            curr = next;
        }
        System.out.print("null ");
        System.out.println();
    }

    private int getPointer(Node node) {

        return node != null ? node.hashCode() : 0;
    }

    private Node dereferencePointer(int pointer) {

        if (pointer != 0) {
            return map.get(pointer);
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {

        Problem_6 xorLinkedList = new Problem_6();
        int index;

        xorLinkedList.addToEnd(1);
        xorLinkedList.addToEnd(2);
        xorLinkedList.addToEnd(3);
        index = 1;

        System.out.println(xorLinkedList.getNodeAtIndex(index).getData());
    }
}
