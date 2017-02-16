package geeksForGeeks.linkedLists;

public class FindingMiddle {

	public static <Data> Node<Data> getMiddleUsingCount(Node<Data> head) {

		int count = 0;
		Node<Data> temp = head;
		while (temp != null) {
			temp = temp.getNextNode();
			count++;
		}

		count = (count / 2) + 1;

		while (--count > 0) {
			head = head.getNextNode();
		}

		return head;

	}

	public static <Data> Node<Data> getMiddleUsingFastPointer(Node<Data> head) {

		Node<Data> fastPointer = head;
		if (head != null) {
			while (fastPointer != null && fastPointer.getNextNode() != null) {
				head = head.getNextNode();
				fastPointer = fastPointer.getNextNode().getNextNode();
			}
		}
		return head;

	}

}
