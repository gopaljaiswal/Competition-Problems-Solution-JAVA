import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class BFSShortestReach {
	int V;
	LinkedList<Integer> adjacentList[];

	BFSShortestReach(int V) {
		this.V = V;
		adjacentList = new LinkedList[V];
		for (int v = 0; v < V; v++) {
			adjacentList[v] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int src, int dest) {
		adjacentList[src - 1].add(dest - 1);
		adjacentList[dest - 1].add(src - 1);
	}

	public void printBFS(int s) {
		int startIdx = s;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[V];
		int[] cost = new int[V];

		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			// System.out.println(s + 1);

			Iterator<Integer> it = adjacentList[s].iterator();
			while (it.hasNext()) {
				int newNode = it.next();
				if (!visited[newNode]) {
					visited[newNode] = true;
					queue.add(newNode);
					cost[newNode] = cost[s] + 1;
				}
			}
		}

		for (int i = 0; i < V; i++) {
			if ((i + 1) != (startIdx + 1)) {
				if (cost[i] == 0) {
					System.out.print("-1" + " ");
				} else {
					System.out.print(6 * cost[i] + " ");
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer query = Integer.parseInt(reader.readLine());
		for (int q = 0; q < query; q++) {
			String[] inRow = reader.readLine().split(" ");
			int n = Integer.parseInt(inRow[0]);
			BFSShortestReach bfsShortestReach = new BFSShortestReach(n);
			int m = Integer.parseInt(inRow[1]);

			for (int e = 0; e < m; e++) {
				String[] inRow1 = reader.readLine().split(" ");
				int u = Integer.parseInt(inRow1[0]);
				int v = Integer.parseInt(inRow1[1]);
				bfsShortestReach.addEdge(u, v);

			}
			int start = Integer.parseInt(reader.readLine());
			bfsShortestReach.printBFS(start - 1);
			System.out.println();
		}
		reader.close();
	}
}
