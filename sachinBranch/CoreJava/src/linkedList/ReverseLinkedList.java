package linkedList;

public class ReverseLinkedList {
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
		System.out.println();
		head=reverseRecursively(head);
		printLinkedList(head);

	}
	private static void reverseLinkedList(Node1 node) {
		Node1 currentNode=node;
		Node1 nextNode=null;
		Node1 previousNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode=currentNode;
			currentNode=nextNode;
		}
		head=previousNode;
	}
	private static void printLinkedList(Node1 node) {
		Node1 tempNode=node;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}
	}
	private static Node1 reverseRecursively(Node1 node){
		Node1 newHead;
	       //base case - tail of original linked list
	       if((node.getNext() == null)){
	           return node;
	       }
	       newHead = reverseRecursively(node.getNext());
	       //reverse the link e.g. C->D->null will be null 
	       /*if(newHead.getData()==10)*/
	       node.getNext().setNext(node);
	       node.setNext(null);  
	       return newHead;
	    }

}
