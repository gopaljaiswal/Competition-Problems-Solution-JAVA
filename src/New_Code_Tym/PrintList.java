/**
 * 
 */
package New_Code_Tym;

import java.awt.HeadlessException;

/**
 * @author gopaljaiswal
 *
 */
public class PrintList {

	/**
	 * @param args
	 */

	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void printList() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		PrintList printList = new PrintList();

		printList.head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		printList.head.next = n2;
		n2.next = n3;
		printList.printList();

	}
}
