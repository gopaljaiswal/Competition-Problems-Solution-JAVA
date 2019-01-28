import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class HappyVertices {
	int v;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			pairs.add(new ArrayList<Integer>());
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			if (u < min) {
				min = u;
			}
			map.put(v - 1, u - 1);
			pairs.get(u - 1).add(v - 1);
			// pairs.get(v - 1).add(u - 1);
		}
		dfs(pairs, map, min - 1);
		in.close();
	}

	public static void dfs(ArrayList<ArrayList<Integer>> pairs,
			HashMap<Integer, Integer> map, int s) {
		Stack<Integer> stack = new Stack<Integer>();
		Integer[] childs = new Integer[pairs.size()];
		Arrays.fill(childs, 0);

		Boolean[] visited = new Boolean[pairs.size()];
		Arrays.fill(visited, false);

		stack.add(s);
		visited[s] = true;
		childs[s] = 0;

		int count = 0;
		while (stack.size() > 0) {
			int ver = stack.pop();
			visited[ver] = true;

			List<Integer> adjEdge = pairs.get(ver);

			// System.out.println(ver + "  --> " + adjEdge);

			childs[ver] = adjEdge.size();
			if (ver != s && childs[map.get(ver)] < childs[ver]) {
				count++;
				// System.out.println(childs[map.get(ver)] + "    " +
				// map.get(ver)
				// + "    " + childs[ver]);
				// System.out.println(ver + "  " + count);
			}

			Iterator<Integer> it = adjEdge.iterator();
			while (it.hasNext()) {
				int chldVer = it.next();
				if (visited[chldVer] == false) {
					stack.add(chldVer);
				}
			}
		}
		// System.out.println(count);

		for (Integer i : childs) {
			System.out.print(i + " ");
		}
	}

}
