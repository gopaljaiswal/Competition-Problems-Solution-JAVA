/**
 * 
 */
package graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author gopaljaiswal
 *
 */
public class AdjacencyListInsertPrint {

	public class Graph {
		int V;
		LinkedList<Integer> adjancyList[];

		Graph(int V) {
			this.V = V;
			adjancyList = new LinkedList[V];
			for (int i = 0; i < V; i++) {
				adjancyList[i] = new LinkedList<Integer>();
			}
		}
	}

	public void addEdge(Graph graph, int src, int dest) {
		graph.adjancyList[src - 1].add(dest - 1);
		// graph.adjancyList[dest - 1].add(src - 1);
	}

	public void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println(graph.adjancyList[v]);
			for (Integer i : graph.adjancyList[v]) {
				System.out.print("-->" + (i + 1));
			}
			System.out.println();
		}
	}

	public void printBFS(Graph graph, int v) {

		boolean[] visited = new boolean[graph.V];
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[v] = true;
		queue.add(v);

		while (queue.size() != 0) {

			v = queue.poll();
			System.out.println((v + 1));

			Iterator<Integer> it = graph.adjancyList[v].iterator();
			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public void takeInput() {
		int V = 7;
		Graph graph = new Graph(V);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 5);
		addEdge(graph, 2, 6);
		addEdge(graph, 5, 7);
		printGraph(graph);
		//printGraph(graph, 0);
	}

	public static void main(String[] args) {
		AdjacencyListInsertPrint adjacencyListInsertPrint = new AdjacencyListInsertPrint();
		adjacencyListInsertPrint.takeInput();
	}

}
