package Twitter.Main.Problem_11;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This problem was asked by Twitter.
 *
 * Implement an autocomplete system. That is, given a query string s and a set
 * of all possible query strings, return all strings in the set that have s as
 * a prefix. For example, given the query string de and the set of strings
 * [dog, deer, deal], return [deer, deal].
 *
 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 *
 */
public class Problem_11 {

    TreeNode root;
    ArrayList<String> suggestList;

    public Problem_11() {

        root = new TreeNode();
        suggestList = new ArrayList<>();
    }

    public void insertTree(String word) {

        TreeNode current = root;
        TreeNode node;

        for (int i = 0; i < word.length(); i++) {

            Character ch = word.charAt(i);
            current.phrase.add(word.substring(i));
            node = current.children.get(ch);

            if (node == null) {

                node = new TreeNode();
                current.children.put(ch, node);
            }

            current = node;
        }

        current.isEndOfWord = true;
    }

    public boolean searchEntireWord(String word) {

        TreeNode current = root;
        TreeNode node;

        if (word.length() == 0) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {

            Character ch = word.charAt(i);
            node = current.children.get(ch);

            if (node == null) {
                return false;
            }
            else {
                current = node;
            }
        }

        return (current != null) && current.isEndOfWord;
    }

    public Set<String> findSuggestionsWithPrefixStored(final String word) {

        TreeNode current = root;
        TreeNode node;

        for (int i = 0; i < word.length(); i++) {

            node = current.children.get(word.charAt(i));
            if (node.children.isEmpty() && node.isEndOfWord) {
                return new HashSet<>(Arrays.asList(word));
            }

            current = node;
        }

        final Set<String> set = current.phrase.stream().map(key -> word + key).collect(Collectors.toSet());
        return set;
    }

    public Set<String> findSuggestions(String word) {

        word = word.toLowerCase();
        TreeNode node = isPrefix(word);
        if (node == null) {
            return new HashSet<>();

        }

        return findSuggestions(node, word);
    }

    private Set<String> findSuggestions(TreeNode node, String value) {

        Set<String> results = new HashSet<>();
        Iterator<Character> iterator = node.children.keySet().iterator();

        while (iterator.hasNext()) {

            Character character = iterator.next();
            if (node.children.get(character).isEndOfWord) {
                results.add(value + character + "");
            }

            results.addAll(findSuggestions(node.children.get(character), value + character+""));
        }

        return results;
    }

    private TreeNode isPrefix(String word) {

        return isPrefix(word, root);
    }
    private TreeNode isPrefix(String word, TreeNode node) {

        if (word.length() == 0) {
            return null;
        }

        if (node == null) {
            return null;
        }

        Character ch = word.charAt(0);

        if (node.children.containsKey(ch)) {
            if (word.length() == 1) {
                return node.children.get(ch);
            }
            return isPrefix(word.substring(1), node.children.get(ch));
        }

        return null;
    }

    public static void main(String[] args) {
        Problem_11 test = new Problem_11();

        test.insertTree("dog");
        test.insertTree("deer");
        test.insertTree("deal");

        // System.out.println(test.searchEntireWord("deer"));

        final Set<String> set = test.findSuggestions("de");

        if (set.isEmpty()) {
            System.out.println("No matches found");
        }

        for (String str : set) {

            System.out.println(str);
        }
    }
}
