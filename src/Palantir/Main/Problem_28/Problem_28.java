package Palantir.Main.Problem_28;

import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Palantir.
 *
 * Write an algorithm to justify text. Given a sequence of words and an
 * integer line length k, return a list of strings which represents each line, fully justified.
 * More specifically, you should have as many words as possible in each line. There
 * should be at least one space between each word. Pad extra spaces when necessary so that
 * each line has exactly length k. Spaces should be distributed as equally as possible,
 * with the extra spaces, if any, distributed starting from the left.
 *
 * If you can only fit one word on a line, then you should pad the right-hand side with spaces.
 * Each word is guaranteed not to be longer than k.
 * For example, given the list of words
 *  ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16,
 *  you should return the following:
 *
 * ["the  quick brown", # 1 extra space on the left
 * "fox  jumps  over", # 2 extra spaces distributed evenly
 * "the   lazy   dog"] # 4 extra spaces distributed evenly
 */
public class Problem_28 {

    public static List<String> justify(List<String> words, int k) {
        List<String> lines = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int length = 0;

        for (String word : words) {
            if (length + line.size() + line.size() > k) {
                lines.add(justify(line, length, k));
                line.clear();
                length = 0;
            }

            line.add(word);
            length += word.length();
        }

        if (!line.isEmpty())
            lines.add(justify(line, length, k));

        return lines;
    }

    private static String justify(List<String> words, int length, int k) {
        int[] spaces = new int[words.size() - 1];

        while (length < k) {
            for (int i = 0; i < spaces.length && length < k; i++) {
                spaces[i]++;
                length++;
            }
        }

        int i = 0;
        StringBuilder buf = new StringBuilder();

        for (String word : words) {
            buf.append(word);

            if (i < spaces.length) {
                for (int j = 0; j < spaces[i]; j++)
                    buf.append(' ');

                i++;
            }
        }

        return buf.toString();
    }

    // Sort of working solution
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        if(words==null || words.length==0){
            return result;
        }


        int count=0;
        int last=0;

        for(int i=0; i<words.length; i++){
            count = count + words[i].length();

            if(count+i-last>maxWidth){
                int wordsLen = count-words[i].length();
                int spaceLen = maxWidth-wordsLen;
                int eachLen = 1;
                int extraLen = 0;

                if(i-last-1>0){
                    eachLen = spaceLen/(i-last-1);
                    extraLen = spaceLen%(i-last-1);
                }

                StringBuilder sb = new StringBuilder();

                for(int k=last; k<i-1; k++){
                    sb.append(words[k]);

                    int ce = 0;
                    while(ce<eachLen){
                        sb.append(" ");
                        ce++;
                    }

                    if(extraLen>0){
                        sb.append(" ");
                        extraLen--;
                    }
                }

                sb.append(words[i-1]);//last words in the line
                //if only one word in this line, need to fill left with space
                while(sb.length()<maxWidth){
                    sb.append(" ");
                }

                result.add(sb.toString());

                last = i;
                count=words[i].length();
            }
        }

        int lastLen = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=last; i<words.length-1; i++){
            count = count+words[i].length();
            sb.append(words[i]+" ");
        }

        sb.append(words[words.length-1]);
        int d=0;
        while(sb.length()<maxWidth){
            sb.append(" ");
        }
        result.add(sb.toString());

        return result;
    }

    public static void main(String[] args) {

        String[] input = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        int k = 16;

        List<String> result1 = new ArrayList<>();
        List<String> input1 = new ArrayList<>();
        List<String> results = new ArrayList<>();
        input1.add("the");
        input1.add("quick");
        input1.add("brown");
        input1.add("fox");
        input1.add("jumps");
        input1.add("over");
        input1.add("the");
        input1.add("lazy");
        input1.add("dog");

        result1 = justify(input1, k);

        System.out.println("List result");

        for (String answer : result1) {
            System.out.println(answer);
        }

        System.out.println("Array result");
        results = fullJustify(input, k);

        for (String result : results) {
            System.out.println(result);
        }

    }
}
