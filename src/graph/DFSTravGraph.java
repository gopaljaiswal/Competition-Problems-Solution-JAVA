/**
 DFS Implementation using stack and without stack
 */

package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */
public class DFSTravGraph {

	int V;
	LinkedList<Integer>[] adjacentList;

	DFSTravGraph(int V) {
		this.V = V;
		adjacentList = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjacentList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest) {
		adjacentList[src - 1].add(dest - 1);
		adjacentList[dest - 1].add(src - 1);
	}

	public void dfsUtil(boolean[] visited, int s) {
		visited[s] = true;
		System.out.println(s + 1);
		Iterator<Integer> it = adjacentList[s].iterator();
		while (it.hasNext()) {
			int n = it.next();
			if (!visited[n]) {
				visited[n] = true;
				dfsUtil(visited, n);
			}
		}
	}

	public void dfsTrav(int s) {
		boolean[] visited = new boolean[V];
		dfsUtil(visited, s);
	}

	public void dfsStackTrav(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		visited[s] = true;
		stack.push(s);
		while (stack.size() != 0) {
			s = stack.pop();
			System.out.println(s);

			Iterator<Integer> it = adjacentList[s].iterator();
			while (it.hasNext()) {
				int n = it.next();
				if (!visited[n]) {
					visited[n] = true;
					stack.push(n);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int N = Integer.parseInt(reader.readLine());
		DFSTravGraph dfsTravGraph = new DFSTravGraph(N);
		for (int i = 0; i < N; i++) {
			String[] inRow = reader.readLine().split(" ");
			dfsTravGraph.addEdge(Integer.parseInt(inRow[0]) + 1,
					Integer.parseInt(inRow[1]) + 1);
		}
		// dfsTravGraph.dfsTrav(0);
		dfsTravGraph.dfsStackTrav(0);
		reader.close();
	}

}
