/**
 * 
 */
package New_Code_Tym;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */

public class KthSmallestElement {

	class Node {
		int data;
		Node left, right = null;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root = null;

	KthSmallestElement() {
		root = null;
	}

	// Insert
	public int kthsmallest(List<Integer> list, int B) {
		for (Integer i : list) {
			root = insertBstRecs(root, i);
		}
		return getRes(B);
	}

	public Node insertBstRecs(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		} else if (root.data < data) {
			root.right = insertBstRecs(root.right, data);
		} else {
			root.left = insertBstRecs(root.left, data);
		}
		return root;
	}

	// Inorder
	public int getRes(int B) {
		return inorder(root, B);
	}

	public int inorder(Node root, int B) {
		int counter = 0;
		int ans = Integer.MIN_VALUE;
		Stack nodes = new Stack<>();
		Node current = root;
		while (!nodes.isEmpty() || current != null) {
			if (current != null) {
				nodes.push(current);
				current = current.left;
			} else {
				Node node = (Node) nodes.pop();
				if (counter == B - 1) {
					ans = node.data;
					break;
				} else {
					counter += 1;
				}
				current = node.right;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		KthSmallestElement ks = new KthSmallestElement();

		List<Integer> list = Arrays.asList(74, 90, 85, 58, 69, 77, 90, 85, 18,
				36);

		System.out.println(ks.kthsmallest(list, 1));
	}

}
