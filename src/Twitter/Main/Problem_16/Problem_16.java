package Twitter.Main.Problem_16;

import java.util.HashMap;
import java.util.Map;

public class Problem_16 {

    private int maxSize;
    private int[] circularBuffer;
    private int currIdx;
    private Map<Integer, Integer> orderIDs = new HashMap<>();

    public Problem_16(int n) {
        this.maxSize = n;
        this.circularBuffer = new int[n];
        this.currIdx = 0;
    }

    public void record(int orderId) {
        circularBuffer[currIdx] = orderId;
        currIdx = (currIdx + 1) % maxSize;
    }

    public int getLast(int i) {
        return circularBuffer[(currIdx - i + maxSize) % maxSize];
    }

    public synchronized void recordMap(int orderID) {

        orderIDs.put(orderIDs.size(), orderID);
    }

    public int getRecordID(int index) {
        return orderIDs.get(index);
    }

    public static void main(String[] args) {
        Problem_16 prob = new Problem_16(20);

        System.out.println(prob.getLast(1));

        System.out.println(prob.getLast(5));
    }

}
