package Microsoft.Main.Problem_22;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This problem was asked by Microsoft.
 *
 * Given a dictionary of words and a string made up of those words (no spaces),
 * return the original sentence in a list. If there is more than one possible
 * reconstruction, return any of them. If there is no possible reconstruction,
 * then return null.
 *
 * For example, given the set of words 'quick', 'brown', 'the', 'fox', and the
 * string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
 *
 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the
 * string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or
 * ['bedbath', 'and', 'beyond'].
 *
 */
public class Problem_22 {

    public static Set<String> words(String... words) {
        return Arrays.stream(words).collect(Collectors.toSet());
    }

    public static List<String> splitWords(Set<String> words, String str) {

        Deque<String> queue = new LinkedList<>();
        splitWords(queue, words, str, 0);
        return queue.isEmpty() ? null : new ArrayList<>(queue);
    }

    public static boolean splitWords(Deque<String> queue, Set<String> words, String str, int offs) {

        if (offs >= str.length()) {
            return true;
        }

        for (String word : words) {

            if (!str.startsWith(word, offs)) {
                continue;
            }

            queue.addLast(word);

            if (splitWords(queue, words, str, offs + word.length())) {
                return true;
            }

            queue.removeLast();
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(splitWords(words("quick", "brown", "the", "fox"), "thequickbrownfox"));
        System.out.println(splitWords(words("bed", "bath", "bedbath", "and", "beyond"), "bedbathandbeyond"));
        System.out.println(splitWords(words("the", "theremin"), "theremin"));
        System.out.println(splitWords(words("a", "aa", "aaa", "aaaa", "aaaaa"), "aaaaab"));
    }
}
