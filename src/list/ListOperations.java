/**
 * 
 */
package list;

/**
 * @author gopaljaiswal
 *
 */
class ListOperations {

	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	// print list
	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "  ");
			n = n.next;
		}
	}

	// After a given node.
	public static void addAfterNode(Node matchNode, Node newNode) {
		Node n = head;
		while (n.data != matchNode.data) {
			n = n.next;
		}
		n = n.next;

		newNode.next = n.next;
		n.next = newNode;
	}

	// At the front of the linked list
	public static void addFirstPos(Node newNode) {
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// At the end of the linked list.
	public static void addEndOfList(Node newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}

	public static void main(String[] args) {
		head = new Node(1);
		printList();
		System.out.println();

		Node newNode = new Node(2);
		addEndOfList(newNode);
		printList();
		System.out.println();

		Node newNode1 = new Node(2);
		addEndOfList(newNode1);
		printList();
		System.out.println();

		Node newNode2 = new Node(3);
		addFirstPos(newNode2);
		printList();
		System.out.println();

		Node newNode3 = new Node(4);
		addFirstPos(newNode3);
		printList();
		System.out.println();

		Node newNode4 = new Node(5);
		addAfterNode(newNode3, newNode4);
		printList();
		System.out.println();

	}

}
