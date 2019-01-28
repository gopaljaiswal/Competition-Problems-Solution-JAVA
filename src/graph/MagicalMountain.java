//https://www.codechef.com/problems/CDVA1602

package graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class MagicalMountain {

	static class Graph {
		int V;
		List<ArrayList<Integer>> adjList;

		public Graph(int V) {
			this.V = V;
			adjList = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < V; i++) {
				adjList.add(new ArrayList<Integer>());
			}
		}
	}

	public static void insertNode(Graph graph, int strtVtx, int endVtx) {
		graph.adjList.get(strtVtx - 1).add(endVtx - 1);
		graph.adjList.get(endVtx - 1).add(strtVtx - 1);
	}

	public static void bfs(Graph graph) {
		Set<Integer> set = new HashSet<Integer>();
		Boolean[] visited = new Boolean[graph.V];
		Arrays.fill(visited, false);
		int[] cost = new int[graph.V];

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		visited[0] = true;

		int mh = 0;
		int firstNodelvl = 0;
		int lastNodelvl = 0;

		while (queue.size() != 0) {
			Integer ver = queue.poll();
			if (cost[ver] > mh) {
				mh = cost[ver];
				firstNodelvl = ver;
				set.add(lastNodelvl + 1);
				set.add(firstNodelvl + 1);
			} else {
				lastNodelvl = ver;
			}

			List<Integer> newList = graph.adjList.get(ver);
			Iterator<Integer> it = newList.iterator();

			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
					cost[n] = cost[ver] + 1;
				}
			}
		}
		set.add(lastNodelvl + 1);

		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int nodeCnts = in.nextInt();
			Graph graph = new Graph(nodeCnts);
			for (int i = 0; i < nodeCnts - 1; i++) {
				int strtVtx = in.nextInt();
				int endVtx = in.nextInt();
				insertNode(graph, strtVtx, endVtx);
			}
			bfs(graph);
		}
		in.close();
	}

}
