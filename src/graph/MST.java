/*  !--Spoj 
 *  http://www.spoj.com/problems/MST/
 *  --*/

package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class MST {

	public static int extractMin(int[] key, Boolean[] mstSet) {
		int resIdx = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < mstSet.length; i++) {
			if (key[i] < min && mstSet[i] == false) {
				min = key[i];
				resIdx = i;
			}
		}
		return resIdx;
	}

	public static void sumMST(int parent[], int V, int graph[][]) {
		long sum = 0;
		for (int i = 1; i < V; i++) {
			sum += graph[i][parent[i]];
		}
		System.out.println(sum);
	}

	public static void getMSTPath(int[][] graph, int V) {
		int[] parent = new int[V];
		Boolean[] mstSet = new Boolean[V];
		int[] key = new int[V];
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		key[0] = 0;
		parent[0] = -1;
		for (int i = 0; i < V; i++) {
			int u = extractMin(key, mstSet);
			mstSet[u] = true;
			for (int v = 0; v < V; v++) {
				if (graph[u][v] != 0 && graph[u][v] < key[v]
						&& mstSet[v] == false) {
					key[v] = graph[u][v];
					parent[v] = u;
				}
			}
		}
		sumMST(parent, V, graph);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] inp = reader.readLine().split(" ");
		int V = Integer.parseInt(inp[0]);
		int N = Integer.parseInt(inp[1]);
		int[][] graph = new int[V][V];

		for (int i = 0; i < N; i++) {
			String[] inp1 = reader.readLine().split(" ");
			graph[Integer.parseInt(inp1[0]) - 1][Integer.parseInt(inp1[1]) - 1] = Integer
					.parseInt(inp1[2]);
			graph[Integer.parseInt(inp1[1]) - 1][Integer.parseInt(inp1[0]) - 1] = Integer
					.parseInt(inp1[2]);
		}
		getMSTPath(graph, V);

		reader.close();
	}
}
