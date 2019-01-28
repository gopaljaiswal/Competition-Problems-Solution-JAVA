/*  !--Hackerrank
 *  https://www.hackerrank.com/challenges/primsmstsub/problem
 * 
 */

package New_Code_Tym;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
class Edge implements Comparable<Edge> {
	public int vertex, weight;

	public Edge(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}

	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}
}

public class PrimsMSTSpecialSubtree {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
		for (int i = 0; i < n; i++) {
			pairs.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < m; i++) {
			int ver1 = sc.nextInt();
			int ver2 = sc.nextInt();
			int weight = sc.nextInt();
			pairs.get(ver1 - 1).add(new Edge(ver2 - 1, weight));
			pairs.get(ver2 - 1).add(new Edge(ver1 - 1, weight));
		}
		int s = sc.nextInt();
		System.out.println(prims(pairs, s - 1, n));
	}

	private static int prims(ArrayList<ArrayList<Edge>> pairs, int s, int n) {
		PriorityQueue<Edge> minHeap = new PriorityQueue<Edge>();
		int minCost = 0;
		int[] visited = new int[n];
		minHeap.add(new Edge(s, 0));
		while (minHeap.size() != 0) {
			Edge e = minHeap.poll();
			if (visited[e.vertex] == 1)
				continue;
			minCost += e.weight;
			visited[e.vertex] = 1;

			for (Edge adj : pairs.get(e.vertex)) {
				if (visited[adj.vertex] == 0)
					minHeap.add(adj);
			}
		}
		return minCost;
	}
}
