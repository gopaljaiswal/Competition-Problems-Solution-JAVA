/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author gopaljaiswal
 *
 */

class Edge implements Comparable<Edge> {
	int vertex;
	int weight;

	public Edge(int V, int weight) {
		this.vertex = V;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}
}

public class BFS01 {

	public static void printDijkstra(ArrayList<ArrayList<Edge>> pairs, int V,
			int src) {
		PriorityQueue<Edge> minHeap = new PriorityQueue<Edge>();
		minHeap.add(new Edge(src, 0));

		int[] wt = new int[V];
		Arrays.fill(wt, Integer.MAX_VALUE);
		wt[src] = 0;

		while (minHeap.size() != 0) {
			Edge e = minHeap.poll();
			int ver = e.vertex;
			for (Edge addEdge : pairs.get(ver)) {
				if (wt[addEdge.vertex] >= wt[e.vertex] + addEdge.weight) {
					wt[addEdge.vertex] = wt[e.vertex] + addEdge.weight;
					minHeap.add(new Edge(addEdge.vertex, addEdge.weight));
				}
			}
		}

		for (int i = 0; i < V; i++) {
			System.out.print(wt[i] + " ");
		}

	}

	public static void printBFS(ArrayList<ArrayList<Edge>> pairs, int V, int src) {
		Queue<Edge> queue = new LinkedList<Edge>();
		queue.add(new Edge(src, 0));

		int[] wt = new int[V];
		Arrays.fill(wt, Integer.MAX_VALUE);
		wt[src] = 0;

		while (queue.size() != 0) {
			Edge e = queue.poll();
			int ver = e.vertex;
			for (Edge addEdge : pairs.get(ver)) {
				if (wt[addEdge.vertex] >= wt[e.vertex] + addEdge.weight) {
					wt[addEdge.vertex] = wt[e.vertex] + addEdge.weight;
					queue.add(new Edge(addEdge.vertex, addEdge.weight));
				}
			}
		}

		for (int i = 0; i < V; i++) {
			System.out.print(wt[i] + " ");
		}

	}

	public static void main(String[] args) {
		int V = 9;
		ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i < V; i++) {
			pairs.add(new ArrayList<Edge>());
		}
		pairs.get(0).add(new Edge(1, 0));
		pairs.get(0).add(new Edge(7, 1));
		pairs.get(1).add(new Edge(7, 1));
		pairs.get(1).add(new Edge(2, 1));
		pairs.get(2).add(new Edge(3, 0));
		pairs.get(2).add(new Edge(5, 0));
		pairs.get(2).add(new Edge(8, 1));
		pairs.get(3).add(new Edge(4, 1));
		pairs.get(3).add(new Edge(5, 1));
		pairs.get(4).add(new Edge(5, 1));
		pairs.get(5).add(new Edge(6, 1));
		pairs.get(6).add(new Edge(7, 1));
		pairs.get(7).add(new Edge(8, 1));
		int src = 0;
		printBFS(pairs, V, src);
	}

}
