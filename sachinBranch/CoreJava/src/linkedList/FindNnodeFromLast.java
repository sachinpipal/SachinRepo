package linkedList;

public class FindNnodeFromLast {
	private static Node1 head = null;

	public static void main(String[] args) {
		head = new Node1(1);
		Node1 n2 = new Node1(2);
		Node1 n3 = new Node1(3);
		Node1 n4 = new Node1(4);
		Node1 n5 = new Node1(5);
		Node1 n6 = new Node1(6);
		Node1 n7 = new Node1(7);
		Node1 n8 = new Node1(8);
		Node1 n9 = new Node1(9);
		Node1 n10 = new Node1(10);
		head.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n10);
		printLinkedList(head);
		Node1 Last_3_Node = find3FromLastNode(head, 1);
		System.out.println("3 last Node : " + Last_3_Node.getData());
	}

	private static Node1 find3FromLastNode(Node1 head, int n) {
		Node1 fastPointer = head;
		Node1 slowPointer = head;

		for (int i = 0; i < n; i++) {
			fastPointer = fastPointer.getNext();
		}

		while (fastPointer != null) {
			fastPointer = fastPointer.getNext();
			slowPointer = slowPointer.getNext();
		}
		return slowPointer;
	}

	private static void printLinkedList(Node1 node) {
		Node1 tempNode = node;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}

	}

}
