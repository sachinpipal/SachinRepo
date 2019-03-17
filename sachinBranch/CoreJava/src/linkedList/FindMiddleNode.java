package linkedList;

public class FindMiddleNode {

	private static Node head = null;

	public static void main(String[] args) {
		addNode(new Node(1));
		addNode(new Node(2));
		addNode(new Node(3));
		addNode(new Node(4));
		addNode(new Node(5));
		addNode(new Node(6));
		addNode(new Node(7));
		addNode(new Node(8));
		addNode(new Node(9));
		addNode(new Node(10));
		printLinkedList(head);
		Node middleNode = whileFindMiddleNode(head);
		System.out.println("Middle Node :" + middleNode.value);
		Node middleNode1 = findMiddleNode(head);
		System.out.println("Middle Node :" + middleNode1.value);

	}

	private static Node whileFindMiddleNode(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;
		while (slowPointer.next != null && fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
	}

	private static Node findMiddleNode(Node head) {
		Node current = head;
		int length = 0;
		Node middle = head;

		while (current.next != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next;
			}
			current = current.next;
		}

		if (length % 2 == 1) {
			return middle;// middle = middle.next;
		}
		return middle;
	}

	protected static void printLinkedList(Node head) {
		Node currentNode = head;
		System.out.println("Printing LinkedList");
		while (currentNode != null) {
			System.out.print(currentNode.value + "-->");
			currentNode = currentNode.next;
		}
	}

	protected static void addNode(Node currentNode) {
		Node tempNode = head;
		if (tempNode != null) {
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.setNext(currentNode);
		} else {
			head = currentNode;
		}

	}

	protected static Node addNode(Node currentNode, Node headNode) {
		Node tempNode = headNode;
		if (tempNode != null) {
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.setNext(currentNode);
		} else {
			headNode = currentNode;
		}
		return headNode;
	}
}

class Node {

	public int value;
	public Node next;

	public Node(int value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;

	}
}
