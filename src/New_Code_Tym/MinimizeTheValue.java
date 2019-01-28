/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gopaljaiswal
 *
 */

class Node {
	int data;
	Node left, right, nextRight;

	Node(int item) {
		data = item;
		left = right = nextRight = null;
	}
}

public class MinimizeTheValue {

	Node root;

	public void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else
				q.add(temp.left);
			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			} else
				q.add(temp.right);
		}
	}

	public static void printLevelOrder(Node root) {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (true) {
			int nodeCount = q.size();
			if (nodeCount == 0)
				break;

			while (nodeCount > 0) {
				Node node = q.peek();
				System.out.print(node.data + " ");
				q.remove();
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
				nodeCount--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		MinimizeTheValue minimizeTheValue = new MinimizeTheValue();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] inp = reader.readLine().split(" ");
		int N = Integer.parseInt(inp[0]);
		int X = Integer.parseInt(inp[1]);

		String[] inp1 = reader.readLine().split(" ");
		int[] cost = new int[N];
		for (int i = 0; i < inp1.length - 1; i++) {
			cost[i] = Integer.parseInt(inp1[i]);
		}
		cost[inp1.length - 1] = X;

		Node node = new Node(1);
		for (int i = 1; i < N; i++) {
			String[] inp2 = reader.readLine().split(" ");
			minimizeTheValue.insert(node, Integer.parseInt(inp2[1]));
		}

		printLevelOrder(new Node(1));
	}
}
