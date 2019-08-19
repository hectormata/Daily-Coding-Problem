package Jane_Street.Main.Problem_32;

import edu.princeton.cs.algs4.*;

import java.io.IOException;

/**
 * This problem was asked by Jane Street.
 *
 * Suppose you are given a table of currency exchange rates, represented as a 2D array.
 * Determine whether there is a possible arbitrage: that is, whether there is some sequence
 * of trades you can make, starting with some amount A of any currency, so that you can end
 * up with some amount greater than A of that currency.
 *
 * There are no transaction costs and you can trade fractional quantities.
 *
 * // Using /Jane_Street/Data/rates.txt
 * // Using Algorithms 4 library from princeton
 */
public class Problem_32 {

    public static boolean containsNegCycle(double[][] graph) {

        int V = graph.length;

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {

                    if (graph[i][j] > graph[i][k] + graph[k][j])
                        graph[i][j] = graph[i][k] + graph[k][j];
                }
            }
        }

        for (int i = 0; i < V; i++) {
            if (graph[i][i] < 0)
                return true;
        }

        return false;
    }
    /**
     *  Reads the currency exchange table from standard input and
     *  prints an arbitrage opportunity to standard output (if one exists).
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws IOException {

        // V currencies
        int V = StdIn.readInt();
        String[] name = new String[V];

        // create complete network
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(V);
        for (int v = 0; v < V; v++) {
            name[v] = StdIn.readString();
            for (int w = 0; w < V; w++) {
                double rate = StdIn.readDouble();
                DirectedEdge e = new DirectedEdge(v, w, -Math.log(rate));
                G.addEdge(e);
            }
        }

        // find negative cycle
        BellmanFordSP spt = new BellmanFordSP(G, 0);
        if (spt.hasNegativeCycle()) {
            double stake = 1000.0;
            for (DirectedEdge e : spt.negativeCycle()) {
                StdOut.printf("%10.5f %s ", stake, name[e.from()]);
                stake *= Math.exp(-e.weight());
                StdOut.printf("= %10.5f %s\n", stake, name[e.to()]);
            }
        } else {
            StdOut.println("No arbitrage opportunity");
        }
    }
}
