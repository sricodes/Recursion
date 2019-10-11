class MyNode {
	int data;
	MyNode next;

	public MyNode(int data) {
		this.data = data;
	}

	public void printNode() {
		MyNode curr = this;
		while (curr != null) {
			System.out.print(curr.data + "\t");
			curr = curr.next;
		}

	}

}

class MyLinkedList {
	MyNode head;

	public MyNode reverseLinkedList(MyNode node) {

		if (node == null || node.next == null)
			return node;

		MyNode prev = reverseLinkedList(node.next);

		node.next.next = node;
		node.next = null;

		return prev;

	}

	public void insert(int data) {
		if (head == null) {
			this.head = new MyNode(data);
		} else {

			MyNode curr = head;
			MyNode toAdd = new MyNode(data);
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = toAdd;

		}
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		MyLinkedList ml = new MyLinkedList();
		ml.insert(1);
		ml.insert(2);
		ml.insert(3);
		ml.insert(4);
		ml.insert(5);
		ml.head.printNode();
		System.out.println("\nreversed order is ");
		ml.reverseLinkedList(ml.head).printNode();

	}
}
