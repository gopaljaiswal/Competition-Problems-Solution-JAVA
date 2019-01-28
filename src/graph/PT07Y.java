/*  !--Spoj 
 *  http://www.spoj.com/problems/PT07Y/
 *  --*/

package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class PT07Y {
	int V, E;
	Edge edge[]; // /collection of all edges

	class Edge {
		int src, dest;
	};

	// Creates a graph with V vertices and E edges
	PT07Y(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i = 0; i < e; ++i)
			edge[i] = new Edge();
	}

	int find(int parent[], int i) {
		if (parent[i] == -1)   
			return i;
		return parent[i] = find(parent, parent[i]);
	}

	public void union(int parent[], int x, int y) {
		int xset = find(parent, x);
		int yset = find(parent, y);
		parent[xset] = yset;
	}

	public int isCycle() {
		int parent[] = new int[V];

		for (int i = 0; i < V; ++i)
			parent[i] = -1;

		for (int i = 0; i < E; ++i) {
			int x = find(parent, edge[i].src);
			int y = find(parent, edge[i].dest);

			if (x == y)
				return 1;

			union(parent, x, y);
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] strArr = reader.readLine().split(" ");
		int noNode = Integer.parseInt(strArr[0]);
		int noEdge = Integer.parseInt(strArr[1]);

		PT07Y graph = new PT07Y(noNode, noEdge);
		for (int i = 0; i < noEdge; i++) {
			String[] str = reader.readLine().split(" ");
			int src = Integer.parseInt(str[0]);
			int dest = Integer.parseInt(str[1]);
			graph.edge[i].src = src - 1;
			graph.edge[i].dest = dest - 1;
		}

		// graph.printGraph();
		int value = graph.isCycle();
		if ((value != 1) && (noNode == noEdge + 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
