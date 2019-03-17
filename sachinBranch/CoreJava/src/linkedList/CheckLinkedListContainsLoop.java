package linkedList;

public class CheckLinkedListContainsLoop {
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
		head.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n2);
		Node1 loopNode = isLoopExist(head);
		System.out.println("Is Loop Exsist :" + loopNode.getData());
		Node1 prevNode = removeLoopNode(head);
		prevNode.setNext(null);
		System.out.println("previous Node Exsist :" + prevNode.getData());
		printLinkedList(head);

	}

	private static Node1 removeLoopNode(Node1 head2) {
		Node1 slowPointer = head;
		Node1 fastPointer = head;
		Node1 prevPointer = null;

		while (fastPointer.getNext() != null && fastPointer.getNext() != null) {
			slowPointer = slowPointer.getNext();
			prevPointer = fastPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			/*System.out.println(
					"slowPointer value : " + slowPointer.getData() + "fastePointer value :" + fastPointer.getData());*/
			if (slowPointer == fastPointer) {
				slowPointer = head;
				while (slowPointer != fastPointer) {
					slowPointer = slowPointer.getNext();
					prevPointer = fastPointer.getNext();
					fastPointer = fastPointer.getNext();
				}
				return prevPointer;
			}
		}
		return null;
	}

	private static Node1 isLoopExist(Node1 head) {
		Node1 slowPointer = head;
		Node1 fastPointer = head;

		while (fastPointer.getNext() != null && slowPointer.getNext() != null) {
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
		/*	System.out.println(
					"slowPointer value : " + slowPointer.getData() + "fastePointer value :" + fastPointer.getData());*/
			if (slowPointer == fastPointer) {
				slowPointer = head;
				while (slowPointer != fastPointer) {
					slowPointer = slowPointer.getNext();
					fastPointer = fastPointer.getNext();
				}
				return slowPointer;
			}
		}
		return null;
	}

	public static void printLinkedList(Node1 head) {
		Node1 currentNode = head;
		System.out.println("Printing LinkedList");
		while (currentNode != null) {
			System.out.print(currentNode.getData() + "-->");
			currentNode = currentNode.getNext();
		}
	}
}

class Node1 {
	private int data;
	private Node1 next;

	Node1(int data) {
		this.data = data;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
