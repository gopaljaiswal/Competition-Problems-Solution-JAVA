/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */
public class IsCyclic {
	int V;
	List<List<Integer>> adjList;

	public IsCyclic(int V) {
		this.V = V;
		adjList = new ArrayList<List<Integer>>();
		for (int i = 0; i < V; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int src, int dest) {
		adjList.get(src).add(dest);
	}

	public void printGraph() {
		for (int i = 0; i < V; i++) {
			Iterator<Integer> it = adjList.get(i).iterator();
			while (it.hasNext()) {
				System.out.print("-->" + it.next());
			}
			System.out.println();
		}
	}

	public Boolean printDFS(int v) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		visited[v] = true;
		stack.add(v);
		int parent = -1;

		while (stack.size() != 0) {
			v = stack.pop();
			parent = v;
			// System.out.println(v);

			Iterator<Integer> it = adjList.get(v).iterator();
			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n]) {
					visited[n] = true;
					stack.add(n);
				} else if (n != parent) {
					return true;
				}
			}
		}
		return false;
	}

	Boolean cycleUtil(int v, Boolean visited[], LinkedList<Integer>[] adjlist,
			int parent) {
		visited[v] = true;
		Iterator<Integer> it = adjlist[v].iterator();
		while (it.hasNext()) {
			int n = it.next();
			if (!visited[n]) {
				if (cycleUtil(n, visited, adjlist, v)) {
					return true;
				}
			} else if (n != parent) {
				return true;
			}
		}
		return false;
	}

	Boolean isCyclic(int V, LinkedList<Integer>[] adjlist) {
		Boolean[] visited = new Boolean[V];
		for (int i = 0; i < V; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				if (cycleUtil(i, visited, adjlist, -1)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		IsCyclic isCyclic = new IsCyclic(88);
		isCyclic.addEdge(12, 28);
		isCyclic.addEdge(67, 17);
		isCyclic.addEdge(0, 26);
		isCyclic.addEdge(30, 11);

		isCyclic.addEdge(38, 85);
		isCyclic.addEdge(57, 60);
		isCyclic.addEdge(57, 15);
		isCyclic.addEdge(30, 31);

		isCyclic.addEdge(65, 80);
		isCyclic.addEdge(75, 19);
		isCyclic.addEdge(68, 67);
		isCyclic.addEdge(73, 84);
		isCyclic.addEdge(63, 86);

		// isCyclic.printGraph();
		System.out.println(isCyclic.printDFS(0));
	}

}
