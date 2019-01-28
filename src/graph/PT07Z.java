/*  !--Spoj 
 *  http://www.spoj.com/problems/PT07Z/
 *  --*/

package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author gopaljaiswal
 *
 */
public class PT07Z {
	int V;
	LinkedList<Integer> adjancyList[];

	PT07Z(int V) {
		this.V = V;
		adjancyList = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjancyList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest) {
		adjancyList[src - 1].add(dest - 1);
		adjancyList[dest - 1].add(src - 1);
	}

	public int lastElemBFS(int v, int type) {
		int lastElement = Integer.MIN_VALUE;
		boolean[] visited = new boolean[V];
		int[] cost = new int[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[v] = true;
		queue.add(v);

		while (queue.size() != 0) {
			v = queue.poll();
			lastElement = v;
			// System.out.println(v);

			Iterator<Integer> it = adjancyList[v].iterator();
			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n] && n != v) {
					visited[n] = true;
					queue.add(n);
					cost[n] = cost[v] + 1;
				}
			}
		}
		if (type == 1)
			return lastElement;
		return cost[lastElement];
	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int V = Integer.parseInt(reader.readLine());
		PT07Z pt07z = new PT07Z(V);
		for (int i = 1; i < V; i++) {
			String inRow[] = reader.readLine().split(" ");
			pt07z.addEdge(Integer.parseInt(inRow[0]),
					Integer.parseInt(inRow[1]));
		}
		int last = pt07z.lastElemBFS(0, 1);
		System.out.println(pt07z.lastElemBFS(last, 0));
	}

}
