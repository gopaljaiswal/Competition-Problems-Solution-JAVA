/**
 * 
 */
package list;

/**
 * @author gopaljaiswal
 *
 */
class ListCycle {

	static ListNode head;

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// print list
	public static void printList() {
		ListNode n = head;
		while (n != null) {
			System.out.print(n.val + "  ");
			n = n.next;
		}
	}

	// At the end of the linked list.
	public static void addEndOfList(ListNode newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}

	public ListNode detectCycle(ListNode a) {
		ListNode p = a;
		ListNode q = a.next.next;

		while (q.next.next != null) {
			// System.out.println(p);
			if (p == q) {
				return p;
			}
			p = p.next;
			q = q.next.next;
		}
		return null;
	}

	public static void main(String[] args) {
		ListCycle listCycle = new ListCycle();

		head = new ListNode(5);
		ListNode newNode = new ListNode(2);
		addEndOfList(newNode);
		ListNode newNode1 = new ListNode(3);
		addEndOfList(newNode1);
		ListNode newNode2 = new ListNode(4);
		addEndOfList(newNode2);
		ListNode newNode3 = new ListNode(2);
		addEndOfList(newNode3);
		ListNode newNode4 = new ListNode(6);
		addEndOfList(newNode4);

		printList();
		System.out.println();

		ListNode cycleNode = listCycle.detectCycle(head);
		System.out.println(cycleNode.val);

	}

}
