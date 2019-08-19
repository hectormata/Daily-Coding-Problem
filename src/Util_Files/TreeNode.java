package Util_Files;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeNode {

    public HashMap<Character, TreeNode> children;
    public boolean isEndOfWord;
    public ArrayList<String> phrase;

    public TreeNode() {

        children = new HashMap<>();
        isEndOfWord = false;
        phrase = new ArrayList<>();
    }
}
