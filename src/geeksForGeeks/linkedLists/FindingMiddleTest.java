package geeksForGeeks.linkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindingMiddleTest {

	@Test
	public void testGetMiddleUsingCount() {
		Node<Integer> node5 = new Node<Integer>(5, null);
		Node<Integer> node4 = new Node<Integer>(4, node5);
		Node<Integer> node3 = new Node<Integer>(3, node4);
		Node<Integer> node2 = new Node<Integer>(2, node3);
		Node<Integer> node1 = new Node<Integer>(1, node2);

		assertTrue((new Integer(3)).equals(FindingMiddle.getMiddleUsingFastPointer(node1).getData()));

	}

}
