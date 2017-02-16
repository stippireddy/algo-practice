package geeksForGeeks.linkedLists;

public class Reverse {

	public static <Data> Node<Data> iterativeReverse(Node<Data> head) {

		if (head == null || head.getNextNode() == null) {
			return head;
		}

		Node<Data> prev = null;
		Node<Data> current = head;
		Node<Data> next = head.getNextNode();
		while (next != null) {
			current.setNextNode(prev);
			prev = current;
			current = next;
			next = next.getNextNode();
		}
		current.setNextNode(prev);
		return current;
	}

	public static <Data> Node<Data> recursiveReverse(Node<Data> head) {

		if (head == null || head.getNextNode() == null) {
			return head;
		}

		Node<Data> reversedHead = recursiveReverse(head.getNextNode());
		head.getNextNode().setNextNode(head);
		head.setNextNode(null);
		return reversedHead;

	}

}
