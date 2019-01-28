import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Gopal Jaiswal
 *
 *         Software Development Engineer
 */

class Edge implements Comparable<Edge> {

	int ver;
	int weight;

	public Edge(int ver, int weight) {
		this.ver = ver;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}

}

public class ATimeSavingAffair {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();

		ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i < m; i++) {
			pairs.add(new ArrayList<Edge>());
		}

		for (int i = 0; i < m; i++) {
			int v1 = in.nextInt() - 1;
			int v2 = in.nextInt() - 1;
			int wt = in.nextInt();
			pairs.get(v1).add(new Edge(v2, wt));
			pairs.get(v2).add(new Edge(v1, wt));
		}
		dijkstraAlgo(pairs, k, n);
		in.close();
	}

	public static void dijkstraAlgo(ArrayList<ArrayList<Edge>> pairs, int k, int n) {
		long totWt = 0L;

		int[] wt = new int[n];
		Arrays.fill(wt, Integer.MAX_VALUE);
		PriorityQueue<Edge> minheap = new PriorityQueue<Edge>();
		minheap.add(new Edge(0, 0));
		wt[0] = 0;

		while (minheap.size() != 0) {
			long loopWt = 0L;
			Edge e = minheap.poll();
			loopWt += e.weight;

			if (loopWt >= k) {
				totWt += k;
				loopWt = 0;
			}

			for (Edge adjEdge : pairs.get(e.ver)) {
				if (wt[adjEdge.ver] > wt[e.ver] + adjEdge.weight) {
					wt[adjEdge.ver] = wt[e.ver] + adjEdge.weight;
					minheap.add(new Edge(adjEdge.ver, adjEdge.weight));
				}
			}
		}

		// for (int i = 0; i < n; i++) {
		// System.out.print(wt[i] + " ");
		// }

		System.out.println(wt[n - 1] + totWt);
	}
}
