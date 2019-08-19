package Microsoft.Main.Problem_33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * This problem was asked by Microsoft.
 *
 * Compute the running median of a sequence of numbers. That is, given a stream of numbers,
 * print out the median of the list so far on each new element.
 * Recall that the median of an even-numbered list is the average of the two middle numbers.
 *
 * For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:
 * 2
 * 1.5
 * 2
 * 3.5
 * 2
 * 2
 * 2
 */
public class Problem_33 {

    static int count = 0;

    public static void computeRunningMedian(int[] sequence) {

        if (sequence.length == 0) {
            System.err.println("Empty sequence");
        }

        List<Integer> answer = new ArrayList<>();
        int count = 0;

        answer.add(sequence[0]);

        for (int i = 0; i <= sequence.length; i++) {

        }
    }

    // method to calculate med of stream
    public static int printMedian(int[] a)
    {

        double med = a[0];

        // max heap to store the smaller half elements
        PriorityQueue<Integer> smaller = new PriorityQueue<>
                (Collections.reverseOrder());

        // min heap to store the greater half elements
        PriorityQueue<Integer> greater = new PriorityQueue<>();

        smaller.add(a[0]);
        count++;
        System.out.println(med);

        // reading elements of stream one by one
        /* At any time we try to make heaps balanced and
            their sizes differ by at-most 1. If heaps are
            balanced,then we declare median as average of
            min_heap_right.top() and max_heap_left.top()
            If heaps are unbalanced,then median is defined
            as the top element of heap of larger size */
        for(int i = 1; i < a.length; i++)
        {

            int x = a[i];

            // case1(left side heap has more elements)
            if(smaller.size() > greater.size())
            {
                if(x < med)
                {
                    greater.add(smaller.remove());
                    smaller.add(x);
                }
                else
                    greater.add(x);
                med = (double)(smaller.peek() + greater.peek())/2;
            }

            // case2(both heaps are balanced)
            else if(smaller.size() == greater.size())
            {
                if(x < med)
                {
                    smaller.add(x);
                    med = (double)smaller.peek();
                }
                else
                {
                    greater.add(x);
                    med = (double)greater.peek();
                }
            }

            // case3(right side heap has more elements)
            else
            {
                if(x > med)
                {
                    smaller.add(greater.remove());
                    greater.add(x);
                }
                else
                    smaller.add(x);
                med = (double)(smaller.peek() + greater.peek())/2;

            }

            count++;
            System.out.println(med);
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

        int[] sequence = new int[]{2,1,5,7,2,0,5};
        printMedian(sequence);

    }
}
