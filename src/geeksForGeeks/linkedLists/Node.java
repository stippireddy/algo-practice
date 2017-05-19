package geeksForGeeks.linkedLists;

public class Node<Data> {

	private Data data;

	private Node<Data> nextNode;

	public Node(Data data) {
		this(data, null);
	}

	public Node(Data data, Node<Data> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Node<Data> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<Data> nextNode) {
		this.nextNode = nextNode;
	}
}
