package Google.Main.Problem_24;

public class Problem_24 {
    
    private Integer data;
    public Problem_24 parent, left, right;
    private boolean locked;
    private int numLockedDescendant = 0;

    public Problem_24(Integer data, Problem_24 parent) {
        this.data = data;
        this.parent = parent;
    }

    public boolean isLocked() {
        return locked;
    }
    public boolean lock() {
        if (numLockedDescendant > 0 || locked == true)
            return false;
        for (Problem_24 curr = parent; curr != null; curr = curr.parent) {
            if (curr.isLocked())
                return false;
        }
        locked = true;
        for (Problem_24 curr = parent; curr != null; curr = curr.parent) {
            curr.numLockedDescendant++;
        }
        return true;
    }

    public void unlock(Problem_24 tree) {
        if (locked) {
            locked = false;
            for (Problem_24 curr = parent; curr != null; curr = curr.parent) {
                curr.numLockedDescendant--;
            }
        }
    }

    @Override
    public String toString() {
        return "LockedBinaryTree{" +
                "data=" + data +
                '}';
    }
    
}
